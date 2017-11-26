package com.spring.hello;

public class ActivemqMessageing  implements Messaging{
	
	public ActivemqMessageing(){
		System.out.println("default constructor activemqmessageing");
	}

	public void sendMessage() {
		System.out.println("Sending activemq message ");		
	}

}
