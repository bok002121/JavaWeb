<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.cyc.bean.Student"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <jsp:useBean id="student" class="com.cyc.bean.Student" scope="request"></jsp:useBean>
    <%=student.getName() %> <br />
    <%
       student.setName("cong"); 
     %> 
    <jsp:getProperty name="student" property="classNo"></jsp:getProperty><br />
    <jsp:getProperty name="student" property="name"></jsp:getProperty><br />
    <jsp:getProperty name="student" property="age"></jsp:getProperty>
    <jsp:getProperty name="student" property="sexy"></jsp:getProperty>
    
    <%=student.getClassNo() %> <br />
    <%=student.getName() %> <br />
    <%=student.getAge() %> <br />
    <%=student.isSexy() %> <br />
    
    <jsp:useBean id="date" class="java.util.Date"></jsp:useBean>
    <%= date.toLocaleString() %>
</body>
</html>