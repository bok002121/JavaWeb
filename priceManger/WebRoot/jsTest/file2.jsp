<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'file2.jsp' starting page</title>
    
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
	        $("input[type=button]").click(function()
	    {
	        var br = $("<br>");
	        var input = $("<input type='file'>");
	        var button = $("<input type='button' value='remove'>");
	        
	        $("#div1").append(br).append(input).append(button);
	        
	        button.click(function()
	        {
	            br.remove();
	            input.remove();
	            button.remove();
	        }
	        );
	    }
	    );
	    });
	</script>

  </head>
  
  <body>
    <input type="file" /> <input type="button" value="more..."/> <br />
    <div id="div1"></div>
  </body>
</html>
