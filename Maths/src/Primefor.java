



	import java.util.Scanner;
	public class Primefor {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number value");
		int n=sc.nextInt();//5
		
		for(int i=2; i<=n; i++)
		{
			
			if(n%i==0)
				System.out.println(n+"is prime");
			return  ;
		}
		
		System.out.println(n+"not prime");
		
		
	}
	}
		
//		boolean flag=true;
//		for (int i=2;i<=n;i++)
//		{
//			if(n%2==0)
//			
//		
//		flag=false;
//		break;
//		//else 
//			//System.out.println("not priome number");
//		}
//		if(flag==true)
//		{
//			System.out.println("prime");
//		}
//			else 
//			{
//				System.out.println("non prime");
//		}
//	

