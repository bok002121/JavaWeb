<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.cyc.bean.Person"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%--需要先 import 类包， 然后 jsp:useBean scope 默认是 page,表示javaBean对象存活范围--%>
	<jsp:useBean id="person" class="com.cyc.bean.Person" scope="request"></jsp:useBean>
	
	<jsp:getProperty property="name" name="person"></jsp:getProperty><br />
	<jsp:getProperty property="age" name="person"></jsp:getProperty><br />
	<jsp:getProperty property="address" name="person"></jsp:getProperty><br />
	
	<jsp:setProperty property="name" name="person" value="fei"></jsp:setProperty>
	<%-- 
	    property 属性 
	    name 对应 useBean id 
	    value 指 
	    scope 默认是 page,表示javaBean对象存活范围
	 --%>
	<jsp:getProperty property="name" name="person"></jsp:getProperty><br />
	<%-- <%= person.getName() %> --%>	
	
	<!-- 这里可以通过使用 param 来获取参数，这样就可以动态设置了 -->
	<jsp:setProperty property="age" name="person" param="helloworld"></jsp:setProperty>
	<jsp:getProperty property="age" name="person"></jsp:getProperty>
	
	<jsp:forward page="javaBean2.jsp"></jsp:forward>
	
</body>
</html>
