package com.communicom.messaging.messages;

import java.time.LocalDateTime;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest extends Message{

	private SignalType signal;
	private String signalValue;
	
	public SetWaitForSignalRequest(){
		super.setName("Set Wait For Signal Request");
		super.setMessageNumber(3);
		super.setEmisionTime(LocalDateTime.now());
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
}
