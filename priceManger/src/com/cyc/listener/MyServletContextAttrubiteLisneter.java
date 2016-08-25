package com.cyc.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttrubiteLisneter implements
		ServletContextAttributeListener
{

	public void attributeAdded(ServletContextAttributeEvent scae)
	{
		// TODO Auto-generated method stub
		System.out.println("attributeAdded");
		System.out.println(scae.getName() + ": " + scae.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent scae)
	{
		// TODO Auto-generated method stub
		System.out.println("attributeRemoved");
		System.out.println(scae.getName() + ": " + scae.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent scae)
	{
		// TODO Auto-generated method stub
		System.out.println("attributeReplaced");
		System.out.println(scae.getName() + ": " + scae.getValue());
	}

}
