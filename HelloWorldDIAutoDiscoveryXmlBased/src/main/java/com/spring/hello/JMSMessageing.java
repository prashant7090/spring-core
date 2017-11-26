package com.spring.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class JMSMessageing implements Messaging {

	public void sendMessage() {
		System.out.println("Sending JMS message");
	}

}
