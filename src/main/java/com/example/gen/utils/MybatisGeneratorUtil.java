package com.example.gen.utils;

import org.apache.commons.lang.ObjectUtils;
import org.apache.velocity.VelocityContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.example.gen.utils.StringUtil.lineToHump;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 9:09 2018/1/24/024.
 * @ Description：
 * @ Modified By：
 */
public class MybatisGeneratorUtil {
    // generatorConfig模板路径
    private static String generatorConfig_vm = "/templates/generatorConfig.vm";
    // Service模板路径
    private static String service_vm = "/templates/Service.vm";
    // ServiceImpl模板路径
    private static String serviceImpl_vm = "/templates/ServiceImpl.vm";
    //Controller模板路径
    private static String controller_vm = "/templates/Controller.vm";

    /**
     * 根据模板生成generatorConfig.xml文件
     *
     * @param jdbc_driver   驱动路径
     * @param jdbc_url      链接
     * @param jdbc_username 帐号
     * @param jdbc_password 密码
     * @param module        项目模块
     * @param database      数据库
     * @param table_prefix  表前缀
     * @param package_name  包名
     */
    public static void generator(
            String jdbc_driver,
            String jdbc_url,
            String jdbc_username,
            String jdbc_password,
            String module,
            String database,
            String table_prefix,
            String package_name,
            Map<String, String> last_insert_id_tables) throws Exception {

        System.out.println("1:" + MybatisGeneratorUtil.class.getResource(generatorConfig_vm));
        generatorConfig_vm = MybatisGeneratorUtil.class.getResource(generatorConfig_vm).getPath().replaceFirst("/", "");
        service_vm = MybatisGeneratorUtil.class.getResource(service_vm).getPath().replaceFirst("/", "");
        serviceImpl_vm = MybatisGeneratorUtil.class.getResource(serviceImpl_vm).getPath().replaceFirst("/", "");
        controller_vm = MybatisGeneratorUtil.class.getResource(controller_vm).getPath().replaceFirst("/", "");

        String targetProject = module;
        String basePath = MybatisGeneratorUtil.class.getResource("/").getPath().replace("/target/classes/", "").replace(targetProject, "").replaceFirst("/", "");
        String generatorConfig_xml = MybatisGeneratorUtil.class.getResource("/").getPath().replace("/target/classes/", "") + "/src/main/resources/generatorConfig.xml";
        targetProject = basePath + targetProject;
        String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "' AND table_name LIKE '" + table_prefix + "_%';";

        System.out.println("========== 开始生成generatorConfig.xml文件 ==========");
        List<Map<String, Object>> tables = new ArrayList<>();
        try {
            VelocityContext context = new VelocityContext();
            Map<String, Object> table;

            // 查询定制前缀项目的所有表
            JdbcUtil jdbcUtil = new JdbcUtil(jdbc_driver, jdbc_url, jdbc_username, AESUtil.AESDecode(jdbc_password));
            List<Map> result = jdbcUtil.selectByParams(sql, null);
            for (Map map : result) {
                System.out.println(map.get("TABLE_NAME"));
                table = new HashMap<>();
                table.put("table_name", map.get("TABLE_NAME"));
                table.put("model_name", lineToHump(ObjectUtils.toString(map.get("TABLE_NAME"))));
                tables.add(table);
            }
            jdbcUtil.release();     //释放连接

            String targetProject_sqlMap = basePath + module;
            context.put("tables", tables);
            context.put("generator_javaModelGenerator_targetPackage", package_name + ".entity");     //存放entity的目录
            context.put("generator_sqlMapGenerator_targetPackage", package_name + ".mapper.xml");   //存放mapper xml的目录
            context.put("generator_javaClientGenerator_targetPackage", package_name + ".mapper");   //存放mapper的目录
            context.put("targetProject", targetProject);
            context.put("targetProject_sqlMap", targetProject_sqlMap);
            context.put("generator_jdbc_password", AESUtil.AESDecode(jdbc_password));
            context.put("last_insert_id_tables", last_insert_id_tables);
            VelocityUtil.generate(generatorConfig_vm, generatorConfig_xml, context);
            // 删除旧代码
            deleteDir(new File(targetProject + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/entity"));                //删除entity
            deleteDir(new File(targetProject + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/mapper"));               //删除mapper
            deleteDir(new File(targetProject_sqlMap + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/mapper/xml"));    //删除mapper xml
            deleteDir(new File(targetProject_sqlMap + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/service"));       //删除service
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("========== 结束生成generatorConfig.xml文件 ==========");

        System.out.println("========== 开始运行MybatisGenerator ==========");
        List<String> warnings = new ArrayList<>();
        File configFile = new File(generatorConfig_xml);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
        System.out.println("========== 结束运行MybatisGenerator ==========");

        System.out.println("========== 开始生成Service ==========");
        String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
        String servicePath = basePath + module + "/" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/service";

        //如果service目录不存则创建目录
        if (!new File(servicePath).exists()) {
            new File(servicePath).mkdir();
        }

        String serviceImplPath = basePath + module + "/" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/service/impl";

        //如果serviceImpl目录不存则创建目录
        if (!new File(serviceImplPath).exists()) {
            new File(serviceImplPath).mkdir();
        }

        String controllerPath = basePath + module + "/" + "/src/main/java/" + package_name.replaceAll("\\.", "/") + "/web";
        //如果controllerPath目录不存则创建目录
        if (!new File(controllerPath).exists()) {
            new File(controllerPath).mkdir();
        }


        for (int i = 0; i < tables.size(); i++) {
            String model = StringUtil.lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));
            String service = servicePath + "/" + model + "Service.java";
            String serviceImpl = serviceImplPath + "/" + model + "ServiceImpl.java";
            String controller = controllerPath + "/" + model + "Controller.java";

            // 生成service
            File serviceFile = new File(service);
            if (!serviceFile.exists()) {
                VelocityContext context = new VelocityContext();
                context.put("package_name", package_name);
                context.put("model", model);
                context.put("ctime", ctime);
                VelocityUtil.generate(service_vm, service, context);
            }

            // 生成serviceImpl
            File serviceImplFile = new File(serviceImpl);
            if (!serviceImplFile.exists()) {
                VelocityContext context = new VelocityContext();
                context.put("package_name", package_name);
                context.put("model", model);
                context.put("mapper", StringUtil.toLowerCaseFirstOne(model));
                context.put("ctime", ctime);
                VelocityUtil.generate(serviceImpl_vm, serviceImpl, context);
            }

            System.out.println("========== 结束生成Service ==========");

            System.out.println("========== 开始生成Controller ==========");

            // 生成controller
            File controllerFile = new File(controller);
            if (!controllerFile.exists()) {
                VelocityContext context = new VelocityContext();
                context.put("package_name", package_name);
                context.put("model", model);
                context.put("mapper", StringUtil.toLowerCaseFirstOne(model));
                context.put("ctime", ctime);
                VelocityUtil.generate(controller_vm, controller, context);
            }

            System.out.println("========== 结束生成Controller ==========");
        }

    }

    // 递归删除非空文件夹
    public static void deleteDir(File dir) {
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                deleteDir(files[i]);
            }
        }
        dir.delete();
    }

}
