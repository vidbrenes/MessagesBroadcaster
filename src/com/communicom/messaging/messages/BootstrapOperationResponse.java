package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public class BootstrapOperationResponse extends Message{
	
	private String version;
	private Boolean result;
	private String errorMessage; 
	
	public BootstrapOperationResponse(){
		super.setName("Bootstrap Operation Response");
		super.setMessageNumber(6);
		super.setEmisionTime(LocalDateTime.now());
	}
	
	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}
	
	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getResult() {
		return result;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
}
