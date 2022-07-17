package Array;
import java.util.Scanner;
public class evenandodd {


	

	
		
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
			// intaly take sum=0 for sum   counting  opertions
				
				int oc=0, eo=0;
				for(int i=0; i<ar.length; i++)
				
				
					{
					if(ar[i]%2==0)
						eo++;
					else
					oc++;
							
					}
					System.out.println(eo);// even 2,4,6
					System.out.println(oc);// odd 1,3,5
				
				
	}
	}

