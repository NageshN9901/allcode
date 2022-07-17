package Array;

import java.util.Scanner;

public class ArrayintospcfiedNexctarrayIndex {
public static void main(String[] args) {
	 ArrayintospcfiedNexctarrayIndex v=new  ArrayintospcfiedNexctarrayIndex();
	 
	int a[]={45,67,23,38,34,29};// specfeing 
	 int b[]= {11,22,33};
	 
	a=v.insertarray(a,b,2);//    // st
	v.diaplayArray(a);//// passing a into that method
}


public int[] insertarray(int[]x, int[]y, int in) {// a,b,2
	
	
	if(in<0||in>x.length)// becuse we need store it in x array   as a array
	{
		
		System.out.println("index not inrange");
	
	return x;
	}
	int z[]=new int[x.length+y.length];// created new array 
// o/p
//	45
//	67
//	11       
//	22
//	33
//	23
//	38
//	34
//	29
	for(int i=0; i<y.length;i++)//45,67,23,38,34,29   
	{                          // 11,22,33        
			                   // 45,67,11,22,33,23,38,34,29
		                       // 0,  1, 2, 3 ,4 ,5 ,6 ,7 ,8 Index
	
		
z[in+i]=y[i]; //1//    z[2+0}=y[0]=2/  z[2+1}=y[`1]=3 z[2+2}=y[`2] =4
	}                                      //        11  22  33              array created
	                                       //  0  1  2   3   4  5  6  7  8 
	for(int i=0; i<x.length;i++)
	{
		if(i<in)    ///2/  0<2 yes //        11  22  33                array created
                                 //  0  1  2   3   4  5  6  7  8 
			z[i]=x[i]; //  z[0]=x[0]=0  z[1]=x[1] =1  z[2]=x[2]=2  i<2 2<2 no else 
		                     //2/   45  67   /1/11  22  33                array created
		                    ////  0   1    // 2   3   4  5  6  7  8 
		else
			z[i+y.length]=x[i];//3 //     z[2+3]=x[3]=5   z[2+4]=x[4]=6 z[2+5]=x[5]=7 z[2+6]=x[6]=8
	                             //   45  67   //11  22    /3/  23  38  34 29         array created
                                ////  0   1    // 2   3   4      5  6  7  8 
	}
		return z;
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
	public void diaplayArray(int ar[])
	{
		for(int i=0; i<ar.length; i++)
		{
			
			System.out.println(ar[i]);
	
		}
	}
}