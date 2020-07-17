package com.test.demo; // 顶类
// 所有其他类必须在com.test.demo之后例如com.test.demo.service
// com.test.demo.*

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
