package com.sp.beans;

public class PDFMessageConverterImpl implements IMessageConverter {

	public String convert(String message) {
		// TODO Auto-generated method stub
		
		return "<pdf>"+message+"</pdf>";
	}

}
