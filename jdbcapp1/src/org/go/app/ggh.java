package org.go.app;

public class ggh {
	
	


		public static void main(String[] args) {
			try {
				Class.forName("com.sql.jdbc.Driver");// inside its fully quilfed name of that respective database server driver class
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();// this method given by throwable exception
			}// after this this line we will get try and catch immdetly
		}
		
		// after doing this first step we will get chcekd exception calleed classnot foundnotexceptioon
	}


