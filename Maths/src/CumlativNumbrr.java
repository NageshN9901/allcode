

	import java.util.Scanner;
	public class CumlativNumbrr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		//System.out.println("enter 3digit value"); should not write in test
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		int d=sc.nextInt();
//		int e=sc.nextInt();
//		System.out.println(a);
//		System.out.println(a+b);
//		System.out.println(a+b+c);
//		System.out.println(a+b+c+d);
//		System.out.println(a+b+c+d+e);
//		
		
		 //we can do onether way
		int ar[]=new int[5];// y usimg array stroing 5 values 0, 1, 2, 3, 4
		for(int i=0;i<5; i++)
		{
			ar[i]=sc.nextInt();// it will take input
		}
		for(int i=0;i<4; i++)
		{
			System.out.println(ar[i]);//5
			ar[i+1]=ar[i+1]+ar[i];//   0+1 = (0+1) (0)  // 1+1=(1+1) (1)=
			System.out.println(ar[4]);
		}
		
				
}
}