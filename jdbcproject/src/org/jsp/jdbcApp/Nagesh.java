package org.jsp.jdbcApp;
import java.sql.*;// it takes all SQL related

public class Nagesh {
public static void main(String[] args) {
	
	Connection con=null;// // it is interface global declaring the connection as null to access for all blocks try catch finally
	Statement  stmt=null;//   it is interface //to create 3rd step to create stMNET OT PLATFORM
	String qry="insert into btm.stu value(5,'GULDU',90.90) ";// 4th step
	String qry1="insert into btm.stu value(2,'GULDU',55.90) ";
	//insert into `btm`.`stu` (`id`, `name`, `per`) values (NUSLL, NULL, NULL)
	try {
		
		Class.forName("com.mysql.jdbc.Driver");//
		System.out.println("Driver class is loaded and registered");
		// 2 establish data base connection with data base server
		// connection is interface so we need to create implementation object by using factory method
		// into that URL we need pass its particular URL database server
		con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
	//connection established with database server
	System.out.println("connection established with database server");
	// 3rd step 
	stmt=(Statement)con.createStatement();// stmt reference of statement interface so its interface so we can create implementation objects
	//platform created above line
	System.out.println("platform created ");
	stmt.executeUpdate(qry1);// 4th step  to write SQL query// 
	System.out.println("excuted sql queries");
	}
	catch(ClassNotFoundException | SQLException e) {// 3rd exception in list
		e.printStackTrace();
	}
	finally {
		if(stmt!=null)// if its not null 
		{
			try {
				stmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		if(con!=null) {
			
			try {
				
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("closed all costly resources");
	}
	
}
}
