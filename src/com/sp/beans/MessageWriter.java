package com.sp.beans;

import com.sp.helper.MessageConverterFactory;

public class MessageWriter {
	IMessageConverter messageConverter;
	
	public void writerMessage(String message){
		String htmlMessage = null;
		htmlMessage = messageConverter.convert(message);
		System.out.println(htmlMessage);
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	

}
