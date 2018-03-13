package com.wang.sixthdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wang.sixthdemo.dao")
public class SixthdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SixthdemoApplication.class, args);
	}
}
