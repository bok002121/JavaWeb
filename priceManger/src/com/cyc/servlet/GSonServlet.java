package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cyc.bean.Address;
import com.cyc.bean.People;
import com.google.gson.Gson;

public class GSonServlet extends HttpServlet
{

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		List<People> list = new ArrayList<People>();
		
		People people1 = new People();
		
		Address address1 = new Address();
		address1.setCompanyAddress("shanghai");
		address1.setHomeAddress("shanghai");
		
		people1.setId(1);
		people1.setName("zhangsan");
		people1.setAddress(address1);
		
		People people11 = new People();
		people11.setId(5);
		people11.setName("hello");
		
		People people12 = new People();
		people12.setId(4);
		people12.setName("hi");
		
		List<People> list1 = new ArrayList<People>();
		list1.add(people11);
		list1.add(people12);
		
		people1.setFriends(list1);
		
		// ----------------------------------------------------------	
		People people2 = new People();
		
		Address address2 = new Address();
		address2.setCompanyAddress("shanghai");
		address2.setHomeAddress("shanghai");
		
		people2.setId(1);
		people2.setName("zhangsan");
		people2.setAddress(address1);
		
		People people21 = new People();
		people11.setId(5);
		people11.setName("hello");
		
		People people22 = new People();
		people12.setId(4);
		people12.setName("hi");
		
		List<People> list2 = new ArrayList<People>();
		list2.add(people21);
		list2.add(people22);
		
		people2.setFriends(list2);
		
		
		list.add(people1);
		list.add(people2);
		
        Gson gson = new Gson();
		
		String result = gson.toJson(list);
		
	    System.out.println(result);
	    
	    response.setContentType("application/json;charset=utf8");
	    response.setHeader("pragma", "no-cache");
		response.setHeader("cache-controle", "no-cache");
		
		PrintWriter out = response.getWriter();
		
		out.println(result);
		out.flush();
		//System.out.println("hello world");
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
