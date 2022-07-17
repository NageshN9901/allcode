package Array;
import java.util.Scanner;
public class bigestinteger {
	

	


		
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
				
				
		int big=0;
		{
			
			
			for(int i=0; i<ar.length; i++)
				if(ar[i]>big)/// 1,2,3 ,1
					// 1>0 yes  next  2>1  next    2>3  next 3>1 no
					big=ar[i];
		// 0>1   1>2      2>3   so 3 is large
			
		}
			System.out.println(big);	
				
				
				
				}
}
