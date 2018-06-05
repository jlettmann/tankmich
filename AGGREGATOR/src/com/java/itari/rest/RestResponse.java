package com.java.itari.rest;

public class RestResponse<T> {
	public T data;
	public boolean success;
	public String message;
	
	public RestResponse(T data, boolean success, String message) {
		this.data = data;
		this.success = success;
		this.message = message;
	}
}
