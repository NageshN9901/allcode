package Array;
import java.util.Scanner;
public class delteelemnt {


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
			public int [] delteelm(int []x,  int in)
			{
				
			if(in<0||in>x.length )// becus eif give out of array its 
			{
				
				//0<0 || 0>6
				System.out.println("index not in range");
				return x;
			}
			int y[]=new int [x.length-1];// new array for insert data
				// 1,2,3
			//    0, 1, 2 but it s 3
				for(int i=0; i<y.length ;i++)//    o to 3// 1to 3//  2 t0 3
				{
					
		if(i<in)// 0<2 no go to else part// 1<3 no go to else part// 2<2 yes
					y[i]=x[i];//  y[2]= x[2]// so delte 3 
		else 
					y[i]=x[i+1];//    y[1]=  x[0+1] so // y[2]= x[1+1]
				
				///ii///o/p// y arry y[ 1  2 ]
				
				}
				return y;
				
			}
			
			
			public static void main(String[] args) {
				delteelemnt  ao=new delteelemnt();
				System.out.println("enrtr elment array");
				int a[]= ao.readArray();// first array
		 a=ao.delteelm(a,3);
			
				
				
				System.out.println("after new  array");
				ao.diaplayArray(a);
			

			}
	}

