package com.mytest.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.mytest.project.mapper")
public class MyTestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTestProjectApplication.class, args);
	}

}
