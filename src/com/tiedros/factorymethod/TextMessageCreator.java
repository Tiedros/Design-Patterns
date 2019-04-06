package com.tiedros.factorymethod;

import com.tiedros.factorymethod.message.Message;
import com.tiedros.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
