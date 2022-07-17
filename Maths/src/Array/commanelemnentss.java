package Array;

import java.util.Scanner;

public class commanelemnentss {
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
		
	 public int[] comman(int []x,int []y)
	   {                                            // 0  1   2  3  4  5
		   int rs[]=new int [x.length];  //  a = x= // 46,67,23,38,34,29
		   int k=0;                       //b=y  //11,23,33,34,67
		  
		   
		         //  0   to   <5    i++
		   for(int i=0; i<x.length; i++)  // 0//1//2//3//4//5//6// onec 
			   
			   
		   {
			   //o  to <4  j++
				   for(int j=0; j<y.length; j++) // all  // 0,1,2,3,4 //0,1,2,3,4//0,1,2,3,4//0,1,2,3,4//0,1,2,3,4 
				   {
					   
					   
if(x[i]==y[j])// if  x[0]==y[0] =  x[46]==y[11] no break is thre means it will not come outside it will do irreratyioon upto end
                 //  x[0]==y[2] =  x[46]==y[23]  no so break gin come only inner loop excutes
                   // x[0]==y[3] =  x[46]==y[23]no 
	               // x[0]==y[4] =  x[46]==y[34]no
	                // x[0]==y[5] =  x[46]==y[45]no
//         next outside for loop takes 2  as itertion
	//   x[1]==y[0] =  x[67]==y[11] no break is thre means it will not come outside it will do irreratyioon upto end
    //  x[1]==y[2] =  x[67]==y[23]  no so break gin come only inner loop excutes
    // x[1]==y[3] =  x[67]==y[33]no 
    // x[1]==y[4] =  x[67]==y[34]no
     // x[1]==y[5] =  x[67]==y[67]yes so store in below
{
	rs[k]=x[i];//    new rs[67] =x[67] k++ move next  so here matching comman values stored we need to put in new array
  //  rs[k]=x[i]  == 	  rs[0]=x[1]					  
						  
						  k++;
						  break;// means it will not go out side of this partcular loop upto end next itretions
					  }
				   }
		   }
					int res[]=new int [k];//    // passing that sored values  in new array 
					{
		for(int i=0; i<k; i++) //                // 0  1   2  3  4  5    o <k means 3  i++
			 //int rs[]=new int [x.length];     // 67 23 34 0 0  0 0 // we need reomeve this 0000 by this method by creating new array
						res[i]=rs[i];// res[i]= rs[i]= res[0]=rs[0]  res[67]=rs[67]
		                            // res[i]= rs[i]= res[1]=rs[1]  res[23]=rs[23]  
		                            // res[i]= rs[i]= res[2]=rs[2]  res[34]=rs[34] 
						 // so new array like 67,23,34 
					
				   }
		return res;
		
	   }  

		   
		   
	
		public static void main(String[] args) {
			commanelemnentss  d=new commanelemnentss();
			int a[]= {46,67,23,38,34,29};
			int b[]= {11,23,33,34,67};
			
			int c[]=d.comman(a,b);
			System.out.println("comman elements");
		d.diaplayArray(c);// pc vassing c 
			
		}
}

