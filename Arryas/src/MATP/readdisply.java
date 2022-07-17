package MATP;
import java.util.*;
public class readdisply {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the order of matrix(row*col)");
	
	int row =sc.nextInt();
	int col=sc.nextInt();
	int mat[][]=new int [row][col];

	System.out.println("enter "+row*col+"values");
	for(int i=0; i<mat.length; i++)////  0// 1//2
	{
		
		
		for(int j=0; j<mat[i].length;j++)  // j=0 j<0 j++   j=0 j<1 j++  j=0; j<2 j++
{
	mat[i][j]=sc.nextInt();//  0of1 and 0 of 1 and o of 2 0 of 3 like .....
	                       // 1of1 and 1of2 and 1of3 and 1of3 and 1of4
	                    //2of1 and 2of2 and 2of3 and 2of3 and 2of4
}
	}
	System.out.println("usre enterd array mayrix");
	for(int i=0; i<mat.length; i++)
	{
		
		for (int j=0; j<mat[i].length; j++)
		{
			
			System.out.print(mat[i][j]+" ");
		}
			System.out.println();	
				
	}
	
}
}
