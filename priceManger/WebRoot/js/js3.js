window.onload = function(){
	
	
	function Parent(username)
	{
		this.username = username;
		
		this.sayHello = function()
		{
			alert(this.username);
		};
	}
	
	function Child(username,password)
	{
		// call ·½Ê½°æµÄ¼Ì³Ð£¡£¡£¡£¡
		Parent.call(this,username);
		
		this.password = password;
		
		this.sayWorld = function()
		{
			alert(this.password);
		};
	}
	
	
	
};