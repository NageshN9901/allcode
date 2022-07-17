package Array;

import java.util.Scanner;

public class mergeArray {

	// merging two arrays
	
	
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
		// need create c method for merge a nd b arrays two arrays

		public int [] merge(int []x, int []y)
		{
			
			int z[]= new int [x.length+y.length];// created new array and stiresd a and b 
			for(int i=0; i<x.length; i++)
				z[i]=x[i];// o itertion and that given store it in z[i
			for(int i=0; i<y.length; i++)
			{
				z[x.length+i]=y[i];// xz(x conter and its new index)= y conter
				
				
			}
			return z;
		}

	
	public static void main(String[] args) {
		mergeArray ao=new mergeArray();
		System.out.println("enrtr the fidrt array");
		int a[]= ao.readArray();// first array
		System.out.println("enter the second array");
		int b[]=ao.readArray();
		System.out.println("user enter fisrt array");
		ao.diaplayArray(a);
		System.out.println("need to diaply 2nd array");
		ao.diaplayArray(b);
		// need create one mthod to merge both arrays
		int c[]= ao.merge(a,b);// accoring to this para sam argumnets will take
		System.out.println(" merged methid displaying");
		ao.diaplayArray(c);
	}
}

