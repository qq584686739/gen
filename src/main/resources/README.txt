27wy.cn：

1、resources下创建配置文件：generator.properties，内容如下：
    generator.jdbc.driver=com.mysql.jdbc.Driver
    generator.jdbc.url=jdbc\:mysql\://dbserver\:3306/table?useUnicode\=true&characterEncoding\=utf-8&autoReconnect\=true
    generator.jdbc.username=root
    generator.jdbc.password=mUnTwjyFIlyMzBQl0XScEB==（数据库密码加密）


2、在spring boot配置mybatis的时候指定mapper需要注意（因为生成的xml文件不在classpath下）
#MyBatis
mybatis.mapper-locations=classpath*:com/example/gen/mapper/xml/*Mapper.xml
#mybatis.mapper-locations=classpath:xml/*.xml
mybatis.type-aliases-package=com.example.gen.entity
mybatis.config-location=classpath:mybatis-config.xml