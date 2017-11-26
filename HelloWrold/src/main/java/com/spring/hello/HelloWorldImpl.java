package com.spring.hello;

public class HelloWorldImpl implements HelloWorld {
	static{
		System.out.println("I am from Static block");
	}
	
	
	HelloWorldImpl(){
		System.out.println("I am in Constructor from HelloWorldImpl");
	}
	
	public void sayHello(String name) {
		System.out.println("Hi "+ name + ", Nice to meet you" );
	}
	
	public void myInit(){
		System.out.println("I am in myinit");
	}
	
	public void myDestroy(){
		System.out.println("I am in destroy metthod");
	}

}
