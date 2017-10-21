package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class PingServerRequest extends Message{

	public PingServerRequest(){
		super.setName("Ping Server Request");
		super.setMessageNumber(1);
		super.setEmisionTime(LocalDateTime.now());
	}
	
}
