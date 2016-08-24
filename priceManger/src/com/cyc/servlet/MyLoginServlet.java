package com.cyc.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cyc.bean.User;

public class MyLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String auth = req.getParameter("auth");

		User user = new User();
		HttpSession session = req.getSession();

		if ("1".equals(auth))
		{
			if ("zhangsan".equals(username) && "123".equals(password))
			{
				user.setUsername(username);
				user.setPassword(password);
				user.setAuth(auth);

				session.setAttribute("user", user);

				req.getRequestDispatcher("filter/index.jsp").forward(req, resp);
				//resp.sendRedirect("filter/index.jsp");
			} 
			else
			{
//				RequestDispatcher rd = req
//						.getRequestDispatcher("filter/login.jsp");
//
//				rd.forward(req, resp);
				resp.sendRedirect("filter/login.jsp");
			}
		} 
		else if ("2".equals(auth))
		{
			if ("lisi".equals(username) && "456".equals(password))
			{
				user.setUsername(username);
				user.setPassword(password);
				user.setAuth(auth);

				session.setAttribute("user", user);

				session.setAttribute("user", user);

				req.getRequestDispatcher("filter/index.jsp").forward(req, resp);
				//resp.sendRedirect("filter/index.jsp");
			} 
			else
			{
				RequestDispatcher rd = req
						.getRequestDispatcher("filter/login.jsp");

				rd.forward(req, resp);
				//resp.sendRedirect("filter/login.jsp");
			}
		} 
		else
		{
//			RequestDispatcher rd = req
//					.getRequestDispatcher("session/login.jsp");
//
//			rd.forward(req, resp);
			resp.sendRedirect("filter/login.jsp");
		}

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}
