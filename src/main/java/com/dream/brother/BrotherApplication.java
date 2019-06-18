package com.dream.brother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dream.brother.dao")
public class BrotherApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrotherApplication.class, args);
	}

}
