package org.jsp.jdbcApp;

public class StackProg 
{
	int capacity,top;
	Object obj[];
	public StackProg(int capacity) 
	{
		this.capacity=capacity;
		this.top=-1;
		obj=new Object[capacity];
	}
	
}
