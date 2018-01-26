package com.example.gen.generator;

import com.example.gen.generator.utils.MybatisGeneratorUtil;
import com.example.gen.generator.utils.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：XJH.
 * @ Date       ：Created in 9:08 2018/1/24/024.
 * @ Description：代码生成类
 * @ Modified By：
 */
public class Generator {
    // 根据命名规范，只修改此常量值即可
    private static String MODULE = PropertiesFileUtil.getInstance("generator").get("generator.moudle");
    private static String DATABASE = PropertiesFileUtil.getInstance("generator").get("generator.database");
    private static String TABLE_PREFIX = PropertiesFileUtil.getInstance("generator").get("generator.table_prefix");
    private static String PACKAGE_NAME = PropertiesFileUtil.getInstance("generator").get("generator.package_name");


    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");

    // 需要insert后返回主键的表配置，key:表名,value:主键名
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();

    static {

    }

    /**
     * 自动代码生成
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        MybatisGeneratorUtil.generator(JDBC_DRIVER,
                JDBC_URL,
                JDBC_USERNAME,
                JDBC_PASSWORD,
                MODULE,
                DATABASE,
                TABLE_PREFIX,
                PACKAGE_NAME,
                LAST_INSERT_ID_TABLES);
    }
}
