import java.util.Scanner;

public class doublearray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);// to read
		
		System.out.println("eneter size of integer");
		int n=sc.nextInt();//  to inbuilt methid to scan upto n
		System.out.println("enetr"+n+"Integer");
		double a[]=new double[n];// declration and allction of memeory
		
	for(int i=0; i<a.length;i++)// array first to last 
	{

	a[i]=sc.nextInt();// array index striing in scanner// for to enter value

	}
	System.out.println("user enter array");
	for (int i=0;i<a.length; i++)/// ;

	{
		System.out.print(a[i]);
		
		
		
		if(i<a.length-1)
			System.out.print(" ,");
	}
			
	}
	}



