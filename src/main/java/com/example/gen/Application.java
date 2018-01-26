package com.example.gen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.gen.mapper")
@EnableTransactionManagement
public class Application{

	public static void main(String[] args) throws Exception {

		SpringApplication.run(Application.class, args);
		System.out.println("启动完成！");
	}
}
