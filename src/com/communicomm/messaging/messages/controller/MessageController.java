package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;

import com.communicom.messaging.factories.MessagesFactory;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.MessageType;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class MessageController {
	//ANTIGUA SOLUCIÓN
	/*
	private ArrayList<PingServerRequest>sentPingRequest = new ArrayList<PingServerRequest>();
	private ArrayList<PingServerResponse>receivedPingResponse = new ArrayList<PingServerResponse>();
	private ArrayList<SetWaitForSignalRequest>sentWaitForSignalRequest = new ArrayList<SetWaitForSignalRequest>();		
	private ArrayList<SetWaitForSignalResponse>ReceivedWaitForSignalResponse = new ArrayList<SetWaitForSignalResponse>();
	*/
	
	//MEJORA CON EL USO DEL FACTORY PATTERN
	private MessagesFactory messagesFactory = new MessagesFactory();
	private ArrayList<Message> messages = new ArrayList<Message>();
	
	public void sendMessage(int messageOption) {
		messages.add(messagesFactory.CreateMessage(MessageType.values()[messageOption-1]));	
	}
	
	public void listMessage() {
		for (Message message : messages) {
			System.out.println(message.toString());
		}
	}
	
	//ANTIGUA SOLUCIÓN
	
	/*
	public void sendMessage(int messageOption) {
		if (messageOption == 1){
			sentPingRequest.add(new PingServerRequest());
		}
		if (messageOption == 2) {
			receivedPingResponse.add(new PingServerResponse());
		}
		if (messageOption == 3) {
			sentWaitForSignalRequest.add(new SetWaitForSignalRequest());
		}
		if (messageOption == 4){ 
			ReceivedWaitForSignalResponse.add(new SetWaitForSignalResponse());
		}	
	}
	
	public void listMessage(int messageOption) {
		if (messageOption == 1){
			for (PingServerRequest currentRequest: sentPingRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 2){
			for (PingServerResponse currentResponse: receivedPingResponse){
				System.out.println(currentResponse);
			}
		}
		if (messageOption == 3){
			for (SetWaitForSignalRequest currentRequest: sentWaitForSignalRequest){
				System.out.println(currentRequest);
			}
		}
		if (messageOption == 4){
			for (SetWaitForSignalResponse currentResponse: ReceivedWaitForSignalResponse){
				System.out.println(currentResponse);
			}
		}
	}
	*/

}
