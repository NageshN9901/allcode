package org.jsp.jdbcApp;

import java.util.Stack;

public class MainStack 
{

	public static void main(String[] args) 
	{
		Stack stk=new Stack<>();
		stk.push(23);
		stk.pop();
		stk.push(55);
		stk.push(55);
		System.out.println(stk);
	}

}
