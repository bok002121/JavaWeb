window.onload = function()
{
	function showLog(message)
	{
	    console.log(message);	
	    console.info(message);
	    console.warn(message);
	    console.error(message);
	    console.debug(message);
	}
	showLog("hello world");

	
	function Shape(edge)
	{
		this.edge = edge;
	}
	
	Shape.prototype.getArea = function()
	{
		return -1;
	};
	
	function Triangle(bottom,height)
	{
		Shape.call(this,3);
		
		this.bottom = bottom;
		this.height = height;
	}
	
	Triangle.prototype = new Shape();
	
	Triangle.prototype.getArea = function()
	{
		return 0.5 * this.bottom * this.height;
	};
	
	Triangle.prototype.getEdge = function()
	{
		return this.edge;
	}
};