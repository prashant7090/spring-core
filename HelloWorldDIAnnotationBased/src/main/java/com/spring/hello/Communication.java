package com.spring.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Communication {
	
	//uses setter injection. It uses it's own setter method so we can remove setter method
	
	@Autowired @Qualifier("jmsMessagingBean")
	//@Required Not Allowed at property level
	private Messaging messaging;
	public Communication() {
		super();
		System.out.println("default constructor Communication");
	}
	
	//@Autowired constructor injection by type search.
	public Communication(Messaging messaging){
		System.out.println("Parameterized constructor Communication");
		this.messaging = messaging;
	}

	public Messaging getMessaging() {
		return messaging;
	}
	//@Autowired setter constructor by type search.
	//@Autowired @Qualifier("jmsMessagingBean")@Required // Can be write at setter level
	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
		System.out.println("Setter Communication");
	}
	
	public void communication(){
		messaging.sendMessage();
	}
	
}
