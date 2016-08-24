package com.cyc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter
{

	public void init(FilterConfig filterConfig) throws ServletException
	{
		// TODO Auto-generated method stub
		System.out.println("init invoked");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		// TODO Auto-generated method stub
		System.out.println("doFilter invoked");
		
		HttpServletRequest r = (HttpServletRequest)request;
		
		System.out.println(r.getContextPath());
		
		HttpSession session = r.getSession();
		
		String requestURI = r.getRequestURI();
		
		if(requestURI.endsWith("login.jsp") ||
				requestURI.endsWith("MyLoginServlet") ||
				 requestURI.endsWith("LoginServlet"))
		{
			chain.doFilter(request, response);
			return ;
		}
		
		if(null == session.getAttribute("user"))
		{
			(( HttpServletResponse )response).sendRedirect("filter/login.jsp");
			return ;
		}
		else
		{
			chain.doFilter(request, response);
		}
	}

	public void destroy()
	{
		// TODO Auto-generated method stub
		System.out.println("destroy invoked");
	}

}
