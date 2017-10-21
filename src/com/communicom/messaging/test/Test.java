package com.communicom.messaging.test;

import com.communicom.messaging.factories.MessagesFactory;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.MessageType;

public class Test {

	public static void main(String[] args) {
		MessagesFactory messagesFactory = new MessagesFactory();
		Message newMessage = messagesFactory.CreateMessage(MessageType.values()[3]);
		
		PrintMessageStatus(newMessage);
	}
	
	public static void PrintMessageStatus(Message message) {
		System.out.println(message.toString());
	}
}
