package com.spring.hello;

public class Communication {
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

	public void setMessaging(Messaging messaging) {
		this.messaging = messaging;
		System.out.println("Setter Communication");
	}
	
	public void communication(){
		messaging.sendMessage();
	}
	
}
