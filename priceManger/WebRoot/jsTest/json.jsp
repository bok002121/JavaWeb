<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'json.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript">
	    $(function(){
   
	        $("#button1").click(function(){
	             var param1 = $("#in1").val();
	             var param2 = $("#in2").val();
	             
	             $.ajax(
	                 {
	                     type:"POST",
	                     url:"MyAjaxServlet",
	                     dataType:"html",
	                     data:{"param1":param1,"param2":param2},
	                     success:function(returnData){
	                         $("#result").val(returnData);
	                     }
	                 }
	             );
	        });
	    });
	
	</script>

  </head>
  
  <body>
    <input type="text" id="in1" /> <br />
    <input type="text" id="in2" /> <br />
    <input type="text" id="result" />
    <input type="button" id="button1" value="get" /><br />
  </body>
</html>
