import java.util.Scanner;

public class Nan {
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//int ar[]= {};
		//for(int i=0; i<=n; i++) {
			//ar[i]=n.nextInt();
			int n,max;
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr number of elment");
			n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enetr elemnts of array");
			boolean rs=n;
			for(int i=0; i<n; i++)
			{
				
				a[i]=sc.nextInt();
				
			}
			boolean m(int a) {
			for (int i=0;i<n; i++)
			{
				 int f1=0,f2=1,f3=0;
				 while(f3<n)
				 {
					 f3=f1+f2;
					 f1=f2;
					 f2=f3;
				 }
				if(f3==n)
				{
					return true;
				}
					
			
			}
	
}
