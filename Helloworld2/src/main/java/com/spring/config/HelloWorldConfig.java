package com.spring.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.hello.HelloWorld;
import com.spring.hello.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
	@Bean(initMethod = "myInit", destroyMethod = "myDestroy")
	public HelloWorld helloWorld(){
		return new HelloWorldImpl();
	}
	
}
