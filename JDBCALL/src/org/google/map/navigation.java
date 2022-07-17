package org.google.map;

public class navigation {

	
	
	public static void main(String[] args) {
		
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class regstred and loaded");
		}
	
	catch(ClassNotFoundException e)
	{
		
		e.printStackTrace();
	}
	}
}
