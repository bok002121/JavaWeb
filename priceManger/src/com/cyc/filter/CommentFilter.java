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

public class CommentFilter implements Filter
{

	public void init(FilterConfig filterConfig) throws ServletException
	{
		// TODO Auto-generated method stub
		String value1 = filterConfig.getInitParameter("hello");
		System.out.println(value1);
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException
	{
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		String username = req.getParameter("username");
		String comment = req.getParameter("comment");
		
		username = username.replace("zhang", "li");
		comment = comment.replace("shengsiyuan", "****");
		
		req.setAttribute("username", username);
		req.setAttribute("comment",comment);
		
		chain.doFilter(request, response);
	}

	public void destroy()
	{
		// TODO Auto-generated method stub

	}

}
