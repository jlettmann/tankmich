package com.java.itari.rest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.java.itari.data.enums.RESTMethod;

public class Request {
	public final RESTMethod  method;
	public Map<String, Object> parameters;
	public Request(Object object, RESTMethod method){
		this.method = method;
		parameters = new HashMap<String, Object>();
		if(object!=null) {

			Class<? extends Object> clazz = object.getClass();
			List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
			fields.forEach(f ->{
				String Name = f.getName();
				Object Value = null;
				if(Modifier.isPublic(f.getModifiers())) {

					try {
						Value = f.get(object);
						
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					
				}
				parameters.put(Name, Value);
			});
		}
	}
	public Request(RESTMethod method, Map<String, Object> params) {
		this.method = method;
		this.parameters = params;
	}
}
