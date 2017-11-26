package com.spring.starter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.expression.BeanFactoryAccessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


import com.spring.hello.HelloWorld;

public class Starter {

	public static void main(String[] args) {
		
		//BeanFactory bean = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		HelloWorld helloObject = (HelloWorld) context.getBean("helloWorld");
		helloObject.sayHello("Prashant");
		context.close();
		
		
	}
}
