package org.jspider.fetchApp;

import java.sql.*;
import java.util.Scanner;

public class iddemo 
{//1
	public static void main(String[] args) 
	{//2
		// to proived dynmic value at run time
		Scanner sc=new Scanner (System.in);
		System.out.println("eneter the id ss >>????");
		int id=sc.nextInt();// to hold the value
		
		Connection con=null;
		PreparedStatement psmt=null;// we are using prepoerd statemnet
		ResultSet rs=null;// to process result data 5th setp
		String qry="select * from btm.student where id=?";// iam gpoing pass intgere id palceholder if we use place holdre we use prpred statment
		
		try 
	{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver class lodede and regster");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");// 3rd exception //2nnd step
			System.out.println("connection estblised within sthe database server");
			// statemnet interface doesnt support placeholder // dont use statement interface
			psmt=con.prepareStatement(qry);
			System.out.println("platfrom created");
			// if placeholeder are user   before the execution  set the data for placeholder//
			psmt.setInt(1, id);
			//  execute the sql queryses
		rs=	psmt.executeQuery();//  stroing into resultent data
		//if(rs.next());// this is wrong 
		// tyo check next data is there are not
		if(rs.next())
		{
			String name=rs.getString(2);// name comes under 2 column// why string means thta ciolumn data type
			double perc=rs.getDouble(3);// perc data type is double
			System.out.println(name+" "+perc);// fetching Data
			// if id are null pounrt exce[ptiuon whivh exceeds the adata 
		}
		
		else
		{
			System.out.println("no data present"+id);
		}
//		if(rs.next())
//		{
//			String name=rs.getString(2);// 2 is column  inedx
//			double perc=rs.getDouble(3);
//			System.out.println(name+" "+perc);
//		}
//		else
//		{
//			System.out.println("no data found for id "+id);
//		}
		//System.out.println("data is inserted");
	}   
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		finally 
		{
		if(rs!=null)
		{
			try
			{
				rs.close();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
			
		}
		if(psmt!=null)
		{
			try {
				psmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();	
			}
		}
		if(con!=null) {
			try {
				con.close();
				
			}catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();	
			}
			
		}// ifge
		
		}//finally
	}//2// main
}//1// class
