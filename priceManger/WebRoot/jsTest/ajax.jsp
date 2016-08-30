<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ajax.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">  
	    var xmlHttpRequest = null;
	    
	    function ajaxSubmit()
	    {
	        
	        
	        if(window.ActiveXObject)   // IE
	        {
	            xmlHttpRequest = new ActiveXObject("Microsoft.XMLHttp");
	        }
	        else if(window.XMLHttpRequest)  //except IE
	        {
	            xmlHttpRequest = new XMLHttpRequest();
	        }
	        
	        if( null != xmlHttpRequest)
	        {
	            var v1 = document.getElementById("value1ID").value;
	            var v2 = document.getElementById("value2ID").value;
	            
	            // get 方法的话，就拼接
	            //xmlHttpRequest.open("GET","AjaxServlet",true);   // true 则异步
	            xmlHttpRequest.open("POST","AjaxServlet",true);
	            
	            // set callback
	            xmlHttpRequest.onreadystatechange = ajaxCallBack;
	            
	            // send to server
	            //xmlHttpRequest.send(null);
	            xmlHttpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded")
	            xmlHttpRequest.send("v1=" + v1 + "&v2=" + v2);
	        }
	    }
	    
	    function ajaxCallBack()
	    {
	        if(xmlHttpRequest.readyState == 4)
	        {
	            if(xmlHttpRequest.status == 200)
	            {
	                var responseText = xmlHttpRequest.responseText;
	                
	                document.getElementById("test").innerHTML = responseText;
	            }
	        }
	    }
	</script>

  </head>
  
  <body>
      <input type="submit" value="change_text" onclick="ajaxSubmit();" /> <br />
      <input type="text" name="value1" id="value1ID"/> <br />
      <input type="text" name="value2" id="value2ID"/> <br /> 
      
      <div id="test"></div>
      
  </body>
</html>
