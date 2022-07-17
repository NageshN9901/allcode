package org.google.app;

public class gmail {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("loaded");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	
}
}