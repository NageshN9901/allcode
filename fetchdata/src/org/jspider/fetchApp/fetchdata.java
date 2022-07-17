package org.jspider.fetchApp;

import java.sql.*;

import java.util.Scanner;

public class fetchdata 
{
public static void main(String[] args) 
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr id");
	int id=sc.nextInt();
	
	Connection con=null;//3// to create connection
	PreparedStatement psmt=null;
	ResultSet rs=null;
	String qry="select * from btm.student where id=?";//DQL
	
	try {
		Class.forName("com.mysql.jdbc.Driver");//1 teps
		System.out.println("driver class loaded and regdstred");
		//con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&passward=admin"); in passward i given a but it password
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
		//4// add exception 3rd option
		System.out.println("Connection estblised  with the data base server");
		// 3rd step of jdbc
	psmt=con.prepareStatement(qry);// conectiopn with platfrom created 
	psmt.setInt(1, id);
	rs=psmt.executeQuery();
	if(rs.next())
	{
		String name=rs.getString(2);// 2 is column  inedx
		double perc=rs.getDouble(3);
		System.out.println(name+" "+perc);
	}
	else
	{
		System.out.println("no data found for id "+id);
	}
	} catch (ClassNotFoundException | SQLException e) {//2
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
{
		if(rs!=null)
			
	{
			try
			{
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
		if(psmt!=null) 
	{
			try {
				psmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
			
   }
		if(con!=null)
  {
				try {
					con.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
  }
	}
	
}
	
	
}
