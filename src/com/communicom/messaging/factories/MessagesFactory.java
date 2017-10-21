package com.communicom.messaging.factories;

import com.communicom.messaging.messages.BootstrapOperationRequest;
import com.communicom.messaging.messages.BootstrapOperationResponse;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.MessageType;
import com.communicom.messaging.messages.PingServerRequest;
import com.communicom.messaging.messages.PingServerResponse;
import com.communicom.messaging.messages.SetWaitForSignalRequest;
import com.communicom.messaging.messages.SetWaitForSignalResponse;

public class MessagesFactory {
	
	public Message CreateMessage(MessageType type) {
		switch(type) {
		case PingServerRequest:
			return new PingServerRequest();
		case PingServerResponse:
			return new PingServerResponse();
		case SetWaitForSignalRequest:
			return new SetWaitForSignalRequest();
		case SetWaitForSignalResponse:
			return new SetWaitForSignalResponse();
		case BootstrapOperationRequest:
			return new BootstrapOperationRequest();
		case BootstrapOperationResponse:
			return new BootstrapOperationResponse();
		}
		
		return null;
	}
}
