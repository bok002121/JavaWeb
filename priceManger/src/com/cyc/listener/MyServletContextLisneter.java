package com.cyc.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextLisneter implements ServletContextListener
{

	public void contextInitialized(ServletContextEvent sce)
	{
		// TODO Auto-generated method stub
		System.out.println("contextInitialized");
	}

	public void contextDestroyed(ServletContextEvent sce)
	{
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed");
	}

}
