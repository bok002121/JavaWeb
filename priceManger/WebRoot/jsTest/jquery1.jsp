<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jquery1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.js"></script>
	
	<script>
	   $(function()
	{
	    var p = $("p");
	    var li = $("ul li:eq(1)");
	    
	    var title = p.attr("title");
	    var title2 = li.attr("title");
	    var text = li.text();
	}
	);
	
	// 创建节点  原生
	
	var addItems = function()
	{
	    var input = document.createElement("p");
	    input.setAttribute("type","text");
	    
	    document.getElementById("pid").appendChild(input);
	}
	</script>

  </head>
  
  <body>
    <p title="hello world" id="pid">sadfasdfasdf</p>
    
    ul>
        <li title="1">1</li>
        <li title="1">2</li>
        <li title="1">3</li>
        <li title="1">4</li>
        <li title="1">5</li>
        <li title="1">6</li>
    </ul> 
  </body>
</html>
