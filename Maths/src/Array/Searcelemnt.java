package Array;

import java.util.Scanner;

public class Searcelemnt {

	public static void main(String[] args) {
		Searcelemnt   ao=new Searcelemnt ();
		System.out.println("enrtr elment array");
		int a[]= ao.readArray();// first array
int n=ao.searcharray(a,23);
if(n==-1)
	System.out.println("elements not present");
else 
	System.out.println("present at "+n+" index");
	
//enrtr elment array
//enetr the siz eof on array
//3
//enetr 3Integrr
//1
//2
//23
//present at2index
//after new  array
//1
//2
//23

		
		System.out.println("after new  array");
		ao.diaplayArray(a);
	

	}
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
	int	searcharray  (int []x , int ele)//
	{
		for(int i=0; i<x.length;i++)
		{
			if(x[i]==ele)
				//   x[i]  == 23// x[ 1,2,23] === it is prsent in 2 index
			return i;
			
		}
		return -1;
		
	}
}

