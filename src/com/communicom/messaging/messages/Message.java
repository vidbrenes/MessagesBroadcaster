package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class Message {
	protected String name;
	protected int messageNumber;
	protected String sourceAddress;
	protected String targetAddress;
	protected LocalDateTime emisionTime;
	
	public Message(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(int messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getTargetAddress() {
		return targetAddress;
	}

	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}

	public LocalDateTime getEmisionTime() {
		return emisionTime;
	}

	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emisionTime = emisionTime;
	}

	public String toString() {
		String result = "\n";
		result += "Message: " + getName() +  "\n";
		result += "Message Number: " + getMessageNumber() +  "\n";
		result += "Emision Time: " + getEmisionTime() +  "\n";
		
		return result;
	}
}
