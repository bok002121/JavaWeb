window.onload = function(){
	
	// ������ʽ�������һ�²������ޣ���������
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
		//��ִ�е�һ�д���ǰ��JS�����Ϊ��������һ������
		//�ں�������ֱ���� this���ƾͳ�Ϊ������ԭ�͡���
		this.username = name;
		this.password = password;
		
		this.getInfo = function()
		{
			alert(this.username + ", " + this.password);
		};
		
		// ʹ�� new �����Ż᷵�ض���
	}
	
	var person = new Person("hello","world");
	//person.getInfo();
	
	// ԭ��ģʽ��ֻ����Ĭ��ֵ����Ү��ûʲô�о�
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
	
	
	// ʹ��ԭ�� + ���캯����ʽ
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