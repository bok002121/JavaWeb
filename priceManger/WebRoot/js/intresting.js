var sayHelloWord = function(){
	alert("hello world");
};

var saySomething = function(str){
	alert(str);
};

$("input:text[name=username]").val("12345");
$("input:text[name=password]").val("12345");
$("input:radio[name=gender]:first").attr("checked","true");
$("input:checkbox[name=interest]:first").attr("checked","true");
$("textarea#comment").val("123");

var checkIntrestingForm = function(){
	var username = $("input:text[name=username]").val();
	var password = $("input:password[name=password]").val();
	var gender = $("input:radio[name=gender]:checked").val(); 
	var checkboxs = $("input:checkbox[name=interest]:checked").val();
	var comment = $("textarea#comment").val();
	var address = $("select#address").val();
	
	if(username == ""){
		alert("sername is empty");
		return false;
	}
	if(password == ""){
		alert("password is empty");
		return false;
	}
	if(username.length < 4 || password.length > 6){
		alert("userlength betweend 4-6");
		return false;
	}
	if(password.length < 4 || password.length > 6){
		alert("password length betweend 4-6");
		return false;
	}
	if(gender == null){
		alert("sex need select");
		return false;
	}
	if(checkboxs == null){
		alert("check box need select");
		return false;
	}
	if(comment == ""){
		alert("comment need write");
		return false;
	}
	if(address == null){
		alert(" address not null");
		return false;
	}
};

//$("#intresting_form").submit(sayHelloWord);

$("#intresting_form").submit(checkIntrestingForm);

