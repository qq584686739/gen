
步骤：
1、新建一个spring boot工程

2、修改pom文件
    2.1覆盖properties
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
        <druid.version>1.1.2</druid.version>
        <mybatis-generator.version>1.3.5</mybatis-generator.version>
        <mybatis.version>1.3.1</mybatis.version>
        <velocity.version>1.7</velocity.version>
        <mybatis-generator-maven-plugin.version>1.3.2</mybatis-generator-maven-plugin.version>
        <commons-fileupload.version>1.3.1</commons-fileupload.version>
        <mybatis-ehcache.version>1.0.0</mybatis-ehcache.version>
    </properties>

	2.2 dependency添加
	<dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>${mybatis.version}</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>com.alibaba</groupId>
        <artifactId>druid-spring-boot-starter</artifactId>
        <version>${druid.version}</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.apache.velocity/velocity -->
    <dependency>
        <groupId>org.apache.velocity</groupId>
        <artifactId>velocity</artifactId>
        <version>${velocity.version}</version>
    </dependency>
    <!-- 上传 -->
    <dependency>
        <groupId>commons-fileupload</groupId>
        <artifactId>commons-fileupload</artifactId>
        <version>${commons-fileupload.version}</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis.generator</groupId>
        <artifactId>mybatis-generator-core</artifactId>
        <version>${mybatis-generator.version}</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-ehcache</artifactId>
        <version>${mybatis-ehcache.version}</version>
    </dependency>

    2.3 build覆盖
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            <plugin>
                <groupId>org.mybatis.generator</groupId>
                <artifactId>mybatis-generator-maven-plugin</artifactId>
                <version>${mybatis-generator-maven-plugin.version}</version>
                <configuration>
                    <verbose>true</verbose>
                    <overwrite>true</overwrite>
                </configuration>
            </plugin>
        </plugins>

        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <filtering>true</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                    <include>**/*.properties</include>
                </includes>
                <filtering>true</filtering>
            </resource>
        </resources>
    </build>

3、导入配置文件（application.properties、generator.properties、mybatis-config.xml）到/resources下
    3.1、修改application.properties端口
    3.2、修改application.properties根路径
    3.3、修改application.properties数据源（url、username、password）
    3.4、修改application.properties mybatis相关配置
        3.4.1、mybatis.mapper-locations=classpath*:com/example/gen/mapper/xml/*Mapper.xml（包路径，只需要修改com/example/gen，其他不用管）
        3.4.2、mybatis.type-aliases-package=com.example.gen.entity（与3.4.1一样，只需要修改com.example.gen）
        3.4.3、说明：3.4.1、3.4.2修改的包路径。
    3.5、修改generator.properties
        3.5.1、值得注意的是password需要用AESUtil加密一下，秘钥是：generator.jdbc.pwd.key=，加密类在utils下的AESUtil


5、导入vm（Controller.vm、generatorConfig.vm、Service.vm、ServiceImpl.vm）到/resources/templates下
    5.1、修改Controller.vm
    5.2、修改generatorConfig.vm
        5.2.1、第19行、41行、60行需要改包名
    5.3、修改Service.vm
        5.3.1、第4行可能需要改包名
    5.4、修改ServiceImpl.vm
        5.4.1、第4行、5行可能需要改包名

6、在包下新建包generator，比如java/com/example/gen，新建一个路径为java/com/example/gen/generator/

7、拷贝base目录、comment目录、plugs目录、utils目录、和Generator.java文件到generator下，再调整刚刚所拷贝的包所引入的包路径，使得Generator.java能运行

8、最后在spring boot项目启动文件上加入
    @MapperScan("com.xxx.xxx.mapper")
    @EnableTransactionManagement




-----------------------------------------------------

博客：27wy.cn
QQ：584686739
QQ群：584686739
邮箱：postmaster@27wy.cn

-----------------------------------------------------
