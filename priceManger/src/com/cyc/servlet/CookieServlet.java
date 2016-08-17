package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet
{
	private int count1;
	private int count2;

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		Cookie cookie = new Cookie("cookieName" + count1++, "cookieValue"
				+ count2++);
		cookie.setMaxAge(10);

		response.addCookie(cookie);
		
		Cookie[] cookies = request.getCookies();
		if (null != cookies)
		{
			for(Cookie c : cookies)
			{
				System.out.println("cookie name: " + c.getName());
				System.out.println("cookie value: " + c.getValue());
			}
		} 

	}

}
