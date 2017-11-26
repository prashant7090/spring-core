package com.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Communication {
	
	//uses setter injection. It uses it's own setter method so we can remove setter method
	 
	private Messaging messaging;
	public Communication() {
		super();
		System.out.println("default constructor Communication");
	}
	
	
	public Communication(Messaging messaging){
		System.out.println("Parameterized constructor Communication");
		this.messaging = messaging;
	}

	public Messaging getMessaging() {
		return messaging;
	}
	
	@Autowired
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
		System.out.println("Setter Communication");
	}
	
	public void communication(){
		messaging.sendMessage();
	}
	
}
