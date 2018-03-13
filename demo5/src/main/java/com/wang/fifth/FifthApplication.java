package com.wang.fifth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.fifth.dao")
public class FifthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FifthApplication.class, args);
	}
}
