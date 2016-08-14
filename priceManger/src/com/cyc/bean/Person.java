package com.cyc.bean;

/*
 * Bean 
 * 是Public的
 * 各属性拥有 getXXX(), setXXX()
 */
public class Person 
{
	private String name = "hello world";
	
	private int age = 10;
	
	private String address = "earth";
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
}
