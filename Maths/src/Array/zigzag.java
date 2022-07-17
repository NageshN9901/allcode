package Array;

import java.util.Scanner;

public class zigzag {
////need to crete one read methods
	int [] readArray()
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enetr the siz eof on array");
		int n=sc.nextInt();
		int ar[]=new int [n];
		System.out.println("enetr "+n+"Integrr");
		
		for(int i=0; i<ar.length; i++)
		{
			
			ar[i]= sc.nextInt();
			
		}
		return ar;
	}
		
		// need to display array
		void diaplayArray(int ar[])
		{
			for(int i=0; i<ar.length; i++)
			{
				
				System.out.println(ar[i]);
		
			}
			
		}
	public int []	zigzaglo (int []x ,int [] y)
	{
		
		int z[]= new int [x.length+y.length];
		int i=0, j=0;
		//System.out.println(x.length);
		//System.out.println(y.length);
		  // 0<4           // 0<5
		while (i<x.length&&i<y.length)/// 0<4 and 0<5
		{            //x              //y           
			// 23 45 56 78 //  21 35 58 62 90
		//x  i             y j   23        
		// z   23 21 45 35 56 58 78 62   90
			z[j++]=x[i];
			z[j++]=y[i++];
		}
	while(i<x.length)
		z[j++]=x[i++];
	while(i<y.length)
	z[j++]=y[i++];// 5  >>  
			return z;
			
	}


public static void main(String[] args) {
	zigzag ao=new zigzag();
	System.out.println("enrtr the fidrt array");
	int a[]= ao.readArray();// first array
	System.out.println("enter the second array");
	int b[]=ao.readArray();
	System.out.println("user enter fisrt array");
	ao.diaplayArray(a);
	System.out.println("need to diaply 2nd array");
	ao.diaplayArray(b);
	// need create one mthod to merge both arrays
	int c[]= ao.zigzaglo(a,b);// accoring to this para sam argumnets will take
	System.out.println(" merged methid displaying");
	ao.diaplayArray(c);
}
}
