import java.util.Scanner;

import Array.sortedarray;

public class addingNewelemntinARRy {
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
		public void diaplayArray(int ar[])
		{
			for(int i=0; i<ar.length; i++)
			{
				
				System.out.println(ar[i]);
		
			}
		}
		
		// need create method insert one new elemnt in exsting array
		// ele is nelement and in is inedx value
		public int [] insertarr(int []x, int ele, int in)
		{
			
		if(in<0||in>x.length )// becus eif give out of array its 
		{
			
			//0<0 || 0>6
			System.out.println("index not in range");
			return x;
		}
		int y[]=new int [x.length+1];// new array for insert data
			y[in]=ele;// it like index=elemnt of that Aray
			for(int i=0; i<x.length ;i++)
			{
				
			if(i<in)
				y[i]=x[i];
			else 
				y[i+1]=x[i];
			
			}
			return y;
			
		}
		
		
		public static void main(String[] args) {
			addingNewelemntinARRy  ao=new addingNewelemntinARRy();
			System.out.println("enrtr elment array");
			int a[]= ao.readArray();// first array
	 a=ao.insertarr(a,39,1);
		
			
			
			System.out.println("after new  array");
			ao.diaplayArray(a);
		

		}
}
//enrtr elment array
//enetr the siz eof on array
//4
//enetr 4Integrr
//1
//25
//36
//39
//after new  array
//1
//39
//25
//36
//39
