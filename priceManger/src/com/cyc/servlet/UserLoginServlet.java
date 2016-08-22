package com.cyc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cyc.bean.User;

public class UserLoginServlet extends HttpServlet
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
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String auth = req.getParameter("auth");
		
		User user = new User();
		HttpSession session = req.getSession();
		
		if( "1".equals(auth))
		{
			if("zhangsan".equals(username) && "123".equals(password))
			{
				user.setUsername(username);
				user.setPassword(password);
				user.setAuth(auth);
				
				session.setAttribute("user", user);
				
				req.getRequestDispatcher("session/index.jsp").forward(req,resp);
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("session/login.jsp");
				
				rd.forward(req, resp);
			}
		}
		else if( "2".equals(auth))
		{
			if("lisi".equals(username) && "456".equals(password))
			{
				user.setUsername(username);
				user.setPassword(password);
				user.setAuth(auth);
				
				session.setAttribute("user", user);
				
                session.setAttribute("user", user);
				
				req.getRequestDispatcher("session/index.jsp").forward(req,resp);
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("session/login.jsp");
				
				rd.forward(req, resp);
			}
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("session/login.jsp");
			
			rd.forward(req, resp);
		}
	}

}
