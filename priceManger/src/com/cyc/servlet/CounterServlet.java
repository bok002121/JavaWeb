package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet
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
		ServletContext context = request.getSession().getServletContext();
		
		if(null == context.getAttribute("counter"))
		{
			context.setAttribute("counter", 1);
		}
		else
		{
			int counter = (Integer)(context.getAttribute("counter"));
			
			context.setAttribute("counter", counter + 1);
		}
		
		request.getRequestDispatcher("views/counter.jsp").forward(request, response);
	}

}
