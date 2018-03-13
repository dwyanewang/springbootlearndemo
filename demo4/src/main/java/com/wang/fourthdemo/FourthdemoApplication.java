package com.wang.fourthdemo;

import com.wang.fourthdemo.property.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FourthdemoApplication implements CommandLineRunner{
	private final HomeProperties homeProperties;

	@Autowired
	public FourthdemoApplication(HomeProperties homeProperties) {
		this.homeProperties = homeProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(FourthdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n" + homeProperties.toString());
		System.out.println();
	}
}
