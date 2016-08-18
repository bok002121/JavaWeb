<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <% String username = request.getParameter("username");
       
       session.setAttribute("username", username);
     %>
     <a href="maillogin.jsp">转向登录</a> <br />
     <a href="maillogout.jsp">注销</a> <br />
     
     当前用户  <b><%= username %></b>
     <p>邮箱 -------------</p>
</body>
</html>