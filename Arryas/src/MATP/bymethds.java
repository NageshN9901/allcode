package MATP;
import java.util.*;
public class bymethds {


// read 2d arrays
	public static void main(String[] args) {
		 bymethds  mt=new  bymethds ();
		 System.out.println("read matreox");
		 int [][]x = mt.readmat();// calling method with stroing with its retuirn typesd
		 System.out.println("eneterd matrix");
		 mt.dismat(x);
		 System.out.println("----------------");
		 int big =mt.getbiggest(x);// passsainf same input 
		 System.out.println("Biggest "+big);
		 int sum=mt.sumofmat(x);
		 System.out.println("sum of matrux element is "+sum);
		 int small=mt.getsmallest(x);
	System.out.println("smallest"+small);
	int[] result=mt. maxatrow(x);
	System.out.println(result);
	}	

public int [][] readmat()
{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of matrix(row*col)");		
		int row =sc.nextInt();// row size
		int col=sc.nextInt();// col um sizes
		int mat[][]=new int [row][col];//passsing the dimension size
	
		System.out.println("enter "+row*col+"values");
		for(int i=0; i<mat.length; i++)////  0// 1//2
		{			
			for(int j=0; j<mat[i].length;j++)  // j=0 j<0 j++   j=0 j<1 j++  j=0; j<2 j++
	{
		mat[i][j]=sc.nextInt();//  0of1 and 0 of 1 and o of 2 0 of 3 like .....
		   // sendning everuy data into that araray                    // 1of1 and 1of2 and 1of3 and 1of3 and 1of4
		                    //2of1 and 2of2 and 2of3 and 2of3 and 2of4
	}	
		}
		return mat;	
}
		// dispaly 2d array
public 	void dismat(int   mat1 [][])
{	
		for(int i=0; i<mat1.length; i++)
		{
			for (int j=0; j<mat1[i].length;j++)
			{
				System.out.print(mat1[i][j]+" ");
				
			}
			System.out.println();
		}		
	}
int getbiggest (int mat[][])
{
	int big=mat[0][0];
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
			
			if(mat[i][j]>big)//   mat[0][1]>0 yes
				big=mat[i][j];	   // big=mat[0][1]= big=1 
			//mat[0][2]>1 yes
			// big=mat[0][2]= 2
			//mat[0][3]>2 yes
			// 2=mat[0][3] so
			// it 3=mat[0][3]    3 is biggest
		}
	}
	return big;
}

int sumofmat(int mat[][])
{
	int sum=0;
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length;j++)
		{
			
			sum=sum+mat[i][j];//    = 0+mat[0][1]  =1 and next 1+mat[0][2]=3   and next 3+mat[0][3]=   6
		                  //	    = 0+mat[0][1]  =1 and next 1+mat[0][2]=3   and next 3+mat[0][3]=   6
					    //         = 0+mat[0][1]  =1 and next 1+mat[0][2]=3   and next 3+mat[0][3]=   6  total 18
			  
			
		}
	}
	return sum;
}
int getsmallest (int mat[][])
{
	int small=mat[0][0];
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; j<mat[i].length; j++)
		{
			
			if(mat[i][j]<small)//   mat[0][1]>0 yes
				small=mat[i][j];	   // big=mat[0][1]= big=1 
			//mat[0][2]>1 yes
			// big=mat[0][2]= 2
			//mat[0][3]>2 yes
			// 2=mat[0][3] so
			// it 3=mat[0][3]    3 is biggest
		}
	}
	return small;
}

public  int[] maxatrow( int[][] mat)
{
	 int [] result =new int [mat.length]; 
	

	for(int i=0; i<mat.length; i++)
	{
		int max=mat[0][0];
		for(int j=0; j<mat[i].length; j++)
		{
			
			if(mat[i][j]>max)//   mat[0][1]>0 yes
				max=mat[i][j];	   // big=mat[0][1]= big
			
}
		result[i]=max;
		
	}
	for(int i=0; i<result.length;i++) {
		
		System.out.println("maxmum in row "+i+" "+result[i]);
	}
	
	
	return result;
	
}

}
//maxmum in row 0 3
//maxmum in row 1 32
//maxmum in row 2 52

//nter 9values
//1
//2
//3
//1
//2
//3
//1
//2
//3
//eneterd matrix
//1 2 3 
//1 2 3 
//1 2 3 
//----------------
//Biggest 3
//sum of matrux element is 18
//
