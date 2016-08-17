package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{
    //private String username;
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
		// ���̷߳�������þ��þֲ�������
		
		// ���ܵĻ������� synchronized{} �����
		String username = request.getParameter("username");
		
		System.out.println(Thread.currentThread().getName());
		
		//request.getCookies();
		
		//����һЩҵ����
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		request.setAttribute("username", username);
		request.getRequestDispatcher("views/hello.jsp").forward(request, response);
	}

}
