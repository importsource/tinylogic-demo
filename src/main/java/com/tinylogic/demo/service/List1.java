package com.tinylogic.demo.service;

import java.sql.Connection;

import com.importsource.dbcp.client.DBClient;
import com.importsource.tinylogic.server.httpserver.annoation.MicroService;
import com.importsource.tinylogic.server.httpserver.core.Request;
import com.importsource.tinylogic.server.httpserver.core.Response;
import com.importsource.tinylogic.server.httpserver.core.impl.DBHttpHandler;

@MicroService(value="/apps/list1")
public class List1 extends DBHttpHandler{
	@Override
	public void doIt(Connection conn, Request request, Response response) {
		obj =  DBClient.list(conn, "select * from user where 1=?","1");
	}
	
}