package com.spring.hello;

import org.springframework.stereotype.Component;

@Component
public class ActivemqMessageing  implements Messaging{
	
	public ActivemqMessageing(){
		System.out.println("default constructor activemqmessageing");
	}

	public void sendMessage() {
		System.out.println("Sending activemq message ");		
	}

}
