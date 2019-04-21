package com.sp.beans;

public class HTMLMessageConverterImpl implements IMessageConverter {

	public String convert(String message) {
		// TODO Auto-generated method stub
		return "<html><body>"+message+"</body></html>";
	}

}
