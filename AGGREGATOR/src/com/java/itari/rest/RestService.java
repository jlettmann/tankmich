package com.java.itari.rest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import com.java.itari.data.enums.RESTMethod;

public class RestService {
	
	public <T> RestResponse<T> execute(Request<T> request){
		//TODO: implement rest access
		
		RestResponse<T> response = null;
		return response;
	}
	
	private <T> RestResponse<T> executeGet(String url, Map<String, Object> parameters){
		//TODO: Implement GET function
		return null;
	}

	private <T> RestResponse<T> executePost(String url, Map<String, Object> parameters){
		//TODO: Implement POST function
		return null;
	}
	
	private <T> RestResponse<T> executePut(String url, Map<String, Object> parameters){
		//TODO: Implement PUT function
		return null;
	}
	
	private <T> RestResponse<T> executeDelete(String url, Map<String, Object> parameters){
		//TODO: Implement DELETE function
		return null;
	}
	
	private String doHttpWork(String url, Map<String, Object> parameters, RESTMethod mode) {
		
		
		return "";
	}
	
}
