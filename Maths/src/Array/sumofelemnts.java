package Array;

import java.util.Scanner;

public class sumofelemnts {
	
	//create one method   
		
		
		/// to read all integeres  method defination
		
			
			public static void main(String[] args) {
				
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr the size of an array");
			int n=sc.nextInt();// to enter the readingsint 
			int ar[]=new int[n];  //memory allction to array
			System.out.println("enetr "+n+"integer");
			for(int i=0; i<ar.length; i++) {
				
				
				ar[i]=sc.nextInt();// storing one by one accroing to index
			}
			int sum=0;// intaly take sum=0 for sum   counting  opertions
			for(int i=0; i<ar.length; i++)
			{
				
				
				sum=sum+ar[i];
			}
			System.out.println(sum);
}
}
