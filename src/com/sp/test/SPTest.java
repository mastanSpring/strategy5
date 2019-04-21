package com.sp.test;

import com.sp.beans.HTMLMessageConverterImpl;
import com.sp.beans.IMessageConverter;
import com.sp.beans.MessageWriter;
import com.sp.beans.PDFMessageConverterImpl;

public class SPTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageWriter messageWriter = new MessageWriter();
		IMessageConverter messageConverter = new PDFMessageConverterImpl();
		messageWriter.setMessageConverter(messageConverter);
		messageWriter.writerMessage("Good morning mastan");

	}

}
