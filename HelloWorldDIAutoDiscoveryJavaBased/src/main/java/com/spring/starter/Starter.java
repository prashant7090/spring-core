package com.spring.starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.config.HelloWorldConfig;
import com.spring.hello.Communication;

public class Starter {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		Communication communication = (Communication) context.getBean("communication");
		communication.communication();
		context.close();
	}
}
