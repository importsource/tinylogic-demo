package com.tinylogic.demo.service;

import com.importsource.classloader.Person;
import com.importsource.tinylogic.conf.DefaultProperties;
import com.importsource.tinylogic.conf.PropertiesTools;
import com.importsource.tinylogic.server.httpserver.annoation.MicroService;
import com.importsource.tinylogic.server.httpserver.core.Request;
import com.importsource.tinylogic.server.httpserver.core.Response;
import com.importsource.tinylogic.server.httpserver.core.impl.DefaultHttpHandler;

/**
 * hello world
 * @author Hezf
 *
 */
@MicroService(value="/apps/hello2")
public class Hello2 extends DefaultHttpHandler{
	@Override
	public void doIt(Request request, Response response) {
		Person p=new Person();
		p.name="HelloWorld22222";
		DefaultProperties p1 =DefaultProperties.newInstance();
		String driverClassName = PropertiesTools.get(p1, "dbcp.driverClassName", null);
		obj =  driverClassName;
	}
	
}
