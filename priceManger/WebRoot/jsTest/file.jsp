<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'file.jsp' starting page</title>
    
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
	    var addMore = function()
	    {
	        var div = document.getElementById("div1");
	        var br = document.createElement("br");
	        var input = document.createElement("input");
	        var button = document.createElement("input");
	        
	        input.setAttribute("type","file");
	        button.setAttribute("type","button");
	        button.setAttribute("value","Remove");
	        
	        button.onclick = function()
	        {
	            div.removeChild(br);
	            div.removeChild(input);
	            div.removeChild(button);
	        };
	        
	        div.appendChild(br);
	        div.appendChild(input);
	        div.appendChild(button);
	    };
	</script>

  </head>
  
  <body>
    <input type="file" /> <input type="button" value="more..." onclick="addMore()"/> <br />
    <div id="div1"></div>
  </body>
</html>
