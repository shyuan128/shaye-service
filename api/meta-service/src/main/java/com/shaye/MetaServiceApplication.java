package com.shaye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shaye.meta.dao")
public class MetaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetaServiceApplication.class, args);
	}
}
