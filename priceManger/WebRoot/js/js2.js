window.onload = function(){
	
	// �̳н��� ����ð��
	function Parent(username)
	{
		this.username = username;
		
		this.sayHello = function()
		{
			alert(this.username);
		};
	}
	
	
	// ��̳оͻ���ܳ��ָ��ǵ�����
	function Child(username,password)
	{
		this.method = Parent;
		this.method(username);  // ��� Child this ͨ���������� Parent��Ȼ�� this ��Child��
		delete this.method;     // ˭���� this ����˭��
		
		this.password = password;
		
		this.sayWorld = function()
		{
			alert(this.password);
		};
	}
	
	
	var parent = new Parent("zhangsan");
	var child = new Child("li","lisi");
	
	
	
	// call ��ʽ
	function test(str)
	{
		alert(this.name + ", " + str);
	}
	
	var object = new Object();
	object.name = "zhangsan";
	
	test.call(object,"shengsiyuan");
	
	
	
	
};