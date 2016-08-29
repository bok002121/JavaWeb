window.onload = function(){
	
	// 继承叫做 对象冒充
	function Parent(username)
	{
		this.username = username;
		
		this.sayHello = function()
		{
			alert(this.username);
		};
	}
	
	
	// 多继承就会可能出现覆盖的问题
	function Child(username,password)
	{
		this.method = Parent;
		this.method(username);  // 这个 Child this 通过函数传到 Parent，然后 this 是Child的
		delete this.method;     // 谁调用 this 就用谁的
		
		this.password = password;
		
		this.sayWorld = function()
		{
			alert(this.password);
		};
	}
	
	
	var parent = new Parent("zhangsan");
	var child = new Child("li","lisi");
	
	
	
	// call 方式
	function test(str)
	{
		alert(this.name + ", " + str);
	}
	
	var object = new Object();
	object.name = "zhangsan";
	
	test.call(object,"shengsiyuan");
	
	
	
	
};