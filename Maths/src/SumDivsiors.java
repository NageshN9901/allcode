


	import java.util.Scanner;
	public class SumDivsiors {
		

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter  number value"); dont do it in test
		int n=sc.nextInt();
//		System.out.println(SumDivsiors.Sumod(n));
		System.out.println(SumDivsiors.Sumod(n));
	}
		static public int Sumod(int n)
		{
			
			
		
			int sum=n;
			for (int i=1; i<=n/2; i++)
			{
				
				if(n%i==0)
			
					sum=sum+i;
			}
		
			
		
	return sum;
		
			}

}
