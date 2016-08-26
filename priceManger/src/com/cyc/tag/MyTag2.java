package com.cyc.tag;

import java.util.Properties;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MyTag2 extends TagSupport
{
	private String key;
	
	public String getKey()
	{
		return key;
	}
	public void setKey(String key)
	{
		this.key = key;
	}
	@Override
	public int doEndTag() throws JspException
	{
		try
		{
			Properties ps = (Properties)this.pageContext.getAttribute("ps",PageContext.APPLICATION_SCOPE);
			
			String message = ps.getProperty(this.key);
			
			this.pageContext.getOut().println(message);
			
			System.out.println(this.key);
		} catch (Exception ex)
		{
			// TODO: handle exception
			ex.printStackTrace();
		}
		// TODO Auto-generated method stub
		return EVAL_PAGE;
	}
}
