package com.cyc.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class ServiceServlet extends HttpServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println(username + " = " + password);
	}
}
