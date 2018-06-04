package com.java.itari.rest;

import com.java.itari.data.enums.RESTMethod;

public class Request<T> {
	public final RESTMethod  method;
	public final T object;
	public Request(T object, RESTMethod method) {
		this.method = method;
		this.object = object;
	}
}
