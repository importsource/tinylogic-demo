package com.tinylogic.demo.service;

import com.importsource.tinylogic.server.httpserver.annoation.MicroService;
import com.importsource.tinylogic.server.httpserver.core.Request;
import com.importsource.tinylogic.server.httpserver.core.Response;
import com.importsource.tinylogic.server.httpserver.core.impl.DefaultHttpHandler;

/**
 * hello world
 * @author Hezf
 *
 */
@MicroService(value="/apps/hello1")
public class Hello1 extends DefaultHttpHandler{
	@Override
	public void doIt(Request request, Response response) {
		//obj =  "";
	}
	
	@Override
	protected void write(Request request, Response response) {
		response.write("<table><tr><td>贺卓凡</td><td>hezf</td></tr></table>");
	}
	
}
