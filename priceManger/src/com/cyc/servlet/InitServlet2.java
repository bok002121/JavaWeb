package com.cyc.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitServlet2 extends HttpServlet
{
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("hello InitServlet2");
        Properties ps = new Properties();
		
		try{
			ServletContext context = config.getServletContext();
			
			InputStream is = context.getResourceAsStream("/WEB-INF/message.properties");
			
			ps.load(is);
			
			is.close();
			
			context.setAttribute("ps", ps);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("error InitServlet2");
		}
	}
}
