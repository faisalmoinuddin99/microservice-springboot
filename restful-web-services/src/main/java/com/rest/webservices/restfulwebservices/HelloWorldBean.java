package com.rest.webservices.restfulwebservices;



public class HelloWorldBean {
	
	private String message ;
	
	public HelloWorldBean() {
		
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}
	

}
