package com.spring.starter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.hello.Communication;

public class Starter {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"app-config.xml");
		Communication communication = (Communication) context.getBean("communication");
		communication.communication();
		context.close();
	}
}
