package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
        String v1 = request.getParameter("v1");
        String v2 = request.getParameter("v2");
        
        String v3 = String.valueOf(Integer.valueOf(v1) + Integer.valueOf(v2));
        
		PrintWriter out = response.getWriter();
		
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-controle", "no-cache");
		
		out.println(v3);
		out.flush();
		out.close();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
        String v1 = request.getParameter("v1");
        String v2 = request.getParameter("v2");
        
        String v3 = String.valueOf(Integer.valueOf(v1) + Integer.valueOf(v2));
        
		PrintWriter out = response.getWriter();
		
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-controle", "no-cache");
		
		
		out.println(v3);
		out.flush();
		out.close();
	}

}
