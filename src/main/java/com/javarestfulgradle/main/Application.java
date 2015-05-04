package com.javarestfulgradle.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

	@Bean(name = "jsontestTime")
	IJsontestTime getJsontestTime() {
		return new JsontestTimeImpl();
	}

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
			IJsontestTime jsontestTime = (IJsontestTime) context.getBean("jsontestTime");
			jsontestTime.getJsontestTime();
		}
	}

}
