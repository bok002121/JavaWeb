window.onload = function()
{
	// ԭ�����ļ̳�
    function Parent()
    {
    	
    }
    
    Parent.prototype.hello = "hello";
    Parent.prototype.sayHello = function()
    {
    	alert(this.hello);
    };
    
    function Child()
    {
    	
    }
    
    Child.prototype = new Parent();
    
    Child.prototype.world = "world";
    Child.prototype.sayWorld = function()
    {
    	alert(this.world);
    };
    
};