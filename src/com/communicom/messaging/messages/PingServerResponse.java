package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerResponse extends Message{
	
	public PingServerResponse(){
		super.setName("Ping Server Response");
		super.setMessageNumber(2);
		super.setEmisionTime(LocalDateTime.now());
	}
}
