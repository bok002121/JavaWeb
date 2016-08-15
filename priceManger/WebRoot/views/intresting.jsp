<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   function validate()
   {
      var username = document.getElementsByName("username")[0];
      var password = document.getElementsByName("password")[0];
      
      if(username.Value.length < 1){
          alert("用户名不为空! ");
          return false;
      }
      
      if(password.value.length < 1){
         alert(" 密码不能为空");
         return false;
      }
   }
</script>
</head>
<body>
	<form action="#"  onsubmit="return validate();">
		用户名: <input type="text" name="username" /><br /> 
		密码: <input type="password" name="password" /><br /> 
		性别: 男 <input type="radio"name="gender" value="男" /> &nbsp;&nbsp; 
		女 <input type="radio" name="gender" value="女" /><br /> 
		兴趣: 足球 <input type="checkbox"name="interest" value="足球"/>&nbsp;&nbsp; 
		篮球<input type="checkbox" name="interest" value="篮球"/>&nbsp;&nbsp; 
		排球<input type="checkbox" name="interest" value="排球"/>&nbsp;&nbsp; 
		羽毛球<input type="checkbox" name="interest" value="羽毛球"/>&nbsp;&nbsp;<br /> 
		地址: <select name="address" id="address">
			<option value="上海">上海</option>
			<option value="北京">北京</option>
			<option value="忽悠">"忽悠"</option>
		</select><br /> 说明:
		<textarea name="comment" id="comment" cols="30" rows="5"></textarea>
		<br /> <input type="submit" value="点击确认" />&nbsp;&nbsp; <input
			type="reset" name="重置" /><br />
	</form>
</body>
</html>