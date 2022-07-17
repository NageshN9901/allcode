package MATP;
import java .util.Scanner;
public class addtwomatrix {
public static void main(String[] args) {
	addtwomatrix mt=new addtwomatrix();
	System.out.println("enter fisrt array");
	int a[][]=mt.readmat();
	
	System.out.println("enetr second array");
	int b[][]=mt.readmat();
	System.out.println("display user ebtred fisrt array");
	mt.dispmat(a);
	System.out.println("display usre enetrd seconf asrray");
	mt.dispmat(b);
	int c[][]=mt.addmat(a,b);
	if(c!=null)
		System.out.println("addtion failed");
	else
	{
		System.out.println("matrix addededed");
		mt.dispmat(c);
	}
}
public int [][]readmat() {// to read 
	
	
	Scanner sc=new Scanner(System.in);
System.out.println("eneterd order of matrix");
int row=sc.nextInt();
int col=sc.nextInt();
int mat[][]=new int [row][col];
	System.out.println("enterd columns and rows "+row*col);
	for(int i=0; i<mat.length; i++)
	{
		for(int j=0; i<mat[i].length;j++)
		{
			
	mat[i][j]=sc.nextInt();// this is going to reteurn 
		}
	}

return mat;
}


void dispmat(int mat[][])// to dispaly array
{
	
	for(int i=0;i<mat.length;i++)
	{
	for(int j=0; i<mat[i].length;j++)
	{
	System.out.print(	mat[i][j]+" ");
		
		
	}
			System.out.println();
		
	}
}
 public int [][] addmat(int [][] x,int [][]y)
{
	// x matrix column !=y matrix column  || x row =!y row
	if(x.length!=y.length                ||x[0].length!=y[0].length)
	return null;// if its not satsfyed it wioll go to c=null
	int[][] z=new int [x.length][x[0].length];
	for(int i=0; i<z.length;i++)
	{
		
		for(int j=0; j<z[0].length; j++)
		{
			
			
			z[i][j]=x[i][j]+y[i][j];
		}
			
	}
	return z;

}
}
