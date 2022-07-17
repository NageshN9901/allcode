package Array;

import java.util.Scanner;

public class sortedarray {

	////need to crete one read methods
		public int [] readArray()
		
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
				public int [] mergesorted(int []x, int []y)
				{
					int z[]= new int [x.length +y.length];
					int i=0,j=0,k=0;
					
					while(i<x.length && j<y.length)
					{
						if(x[i]<y[j])
								z[k++]=x[i++];
						else 
							z[k++]=y[j++];
				}
					while (i<x.length)
						z[k++]=x[i++];
					while(j<y.length)
						z[k++]=y[j++];
								return z;
		
			}
	public static void main(String[] args) {
		sortedarray  ao=new sortedarray();
		System.out.println("enrtr the fidrt array");
		int a[]= ao.readArray();// first array
		System.out.println("enter the second array");
		int b[]=ao.readArray();
		System.out.println("user enter fisrt array");
		ao.diaplayArray(a);
		System.out.println("need to diaply 2nd array");
		ao.diaplayArray(b);
		// need create one mthod to merge both arrays
		int c[]= ao.mergesorted(a,b);// accoring to this para sam argumnets will take
		System.out.println(" merged methid displaying");
		ao.diaplayArray(c);
	}
	}


