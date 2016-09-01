<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajaxjson.jsp' starting page</title>
    
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
	             $.get(
	                 "GSonServlet",
	                 {},
	                 function(returnData,status)
	                 {
	                     var html = "<table width='60%' border='1' align='center'><tr><th>id</th><th>name</th><th>companyAddress</th><th>homeAddress</th>";
	                     
	                     for(var i = 0; i< returnData.length; i++)
	                     {
	                         var people = returnData[i];
	                         var id = people.id;
	                         var name = people.name; 
	                         var companyAddress = people.address.companyAddress;
	                         var homeAddress = people.address.homeAddress;
	                         
	                         html += "<tr align='center'><td>" + id + "</td><td>" + name + "</td><td>" + companyAddress + "</td><td>" + homeAddress + "</td>";
	                              
	                     }
	                      html += "</table>";
	                         
	                      $("#theBody table:eq(0)").remove();
	                         
	                      $("#theBody").append(html);
	                 }
	             );
	        });
	    });
	
	</script>

  </head>
  
  <body id="theBody">
    <input type="text" id="result" />
    <input type="button" id="button1" value="get" /><br />
  </body>
</html>
