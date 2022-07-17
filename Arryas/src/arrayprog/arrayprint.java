package arrayprog;
import java.util.Scanner;
public class arrayprint {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr  Integer");
	int n=sc.nextInt();// read 
	System.out.println("enetr  "+n+"Integer"); 
	int ar[]=new int[n];// store craete memory of that length
	
	// now need access one by one and store it in array
	for(int i=0; i<ar.length; i++)
	{
		
		
		ar[i]=sc.nextInt();
			
	}
	System.out.println("user enrtrd array");

	for(int i=0; i<ar.length;i++)
	{
		
		
		System.out.print(ar[i]);
		if(i<ar.length-1)//;    if n=5 <ar.length-1 means 1,2,3,4,5-1 but its array 0,1,2,3,4,5-1 but i  dont want after 5 
		System.out.print(" ,");
	}
	}
}
