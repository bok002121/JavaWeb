window.onload = function(){
	
	// 工厂方式，再添加一下参数，噢，就是这样
	function createObject(name,password)
	{
		var object = new Object();
		
		object.username = name;
		object.password = password;
		
		object.get = function()
		{
			alert(this.username + ", " + this.password);
		};
		
		return object;
	}
	
	var object1 = createObject("hello","world");
	var object2 = createObject("hello","too");
	
	//object1.get();
	//object2.get();
	
	function Person(name,password)
	{
		//在执行第一行代码前，JS引擎会为我们生成一个对象
		//在函数里面直接用 this估计就成为对象了原型。，
		this.username = name;
		this.password = password;
		
		this.getInfo = function()
		{
			alert(this.username + ", " + this.password);
		};
		
		// 使用 new 方法才会返回对象
	}
	
	var person = new Person("hello","world");
	//person.getInfo();
	
	// 原型模式，只是有默认值而已耶，没什么感觉
	function PersonPrototype()
	{
		
	}
	
	PersonPrototype.prototype.username = "zhangsan";
	PersonPrototype.prototype.password = "123";
	
	PersonPrototype.prototype.getInfo = function()
	{
		alert(this.username + ", " + this.password);
	};
	
	var person = new Person();
	
	person.username = "lisi";
	
	//person.getInfo();
	
	
	// 使用原型 + 构造函数方式
	function PersonTwo()
	{
		this.username = new Array();
		this.password = "123";
	}
	
	PersonTwo.prototype.getInfo = function()
	{
		alert(this.username + ", " + this.password);
	};
	
	
	function PersonThree()
	{
		this.username = "zhangsan";
		this.password = "123";
		
		if(typeof PersonThree.flag == "undefined")
	    {
			PersonThree.prototype.getInfo = function()
			{
				alert(this.username + ", " + this.password);
			};
			
			PersonThree.flag = true;
	    }
	}
	
	var p = new PersonThree();
	//p.getInfo();
	
	
	
	
	
};