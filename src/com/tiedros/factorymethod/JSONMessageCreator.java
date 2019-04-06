package com.tiedros.factorymethod;

import com.tiedros.factorymethod.message.JSONMessage;
import com.tiedros.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
