package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationRequest extends Message{

	private String version;
	
	public BootstrapOperationRequest(){
		super.setName("Bootstrap Operation Request");
		super.setMessageNumber(5);
		super.setEmisionTime(LocalDateTime.now());
	}
	
	public String getVersion() {
		return version;
	}
	
}
