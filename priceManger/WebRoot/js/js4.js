window.onload = function()
{
	// apply ��ʽ�̳�
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
		Parent.apply(this,new Array(username));
		
		this.password = password;
		
		this.sayWorld = function()
		{
			alert(this.password);
		};
	}
	
	
};