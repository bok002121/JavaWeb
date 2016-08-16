package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessServlet extends HttpServlet
{

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
	 *             
	 *    init(),destroy(),service()
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		this.process(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		this.process(request, response);
	}

	public void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		request.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] interest = request.getParameterValues("interest");
		String address = request.getParameter("address");
		String comment = request.getParameter("comment");
		
		//address = new String(address.getBytes("ios-88591"),"utf-8");

		List<String> list = new ArrayList<String>();

		if (null == username || "".equals(username))
		{
			list.add("用户名不能为空");
		} else if (username.length() < 4)
		{
			list.add("用户名过短");
		} else if (username.length() > 6)
		{
			list.add("用户名过长");
		}

		if (null == password || "".equals(password))
		{
			list.add("密码不能为空");
		} else if (password.length() < 4)
		{
			list.add("密码过短");
		} else if (password.length() > 6)
		{
			list.add("密码过长");
		}

		if (null == gender)
		{
			list.add("性别不能为空");
		}
		if (null == interest)
		{
			list.add("兴趣不能为空");
		}
		if (null == comment || "".equals(comment))
		{
			list.add("评论不能为空");
		}

		if (list.isEmpty())
		{
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			request.setAttribute("gender", gender);
			request.setAttribute("interest", interest);
			request.setAttribute("address", address);
			request.setAttribute("comment", comment);

			System.out.println("hello world");
			request.getRequestDispatcher("views/loginSuccess.jsp").forward(request,
					response);
		} else
		{
			request.setAttribute("error", list);

			request.getRequestDispatcher("views/loginFailure.jsp").forward(request,
					response);
		}
	}

}
