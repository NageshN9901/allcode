import java.util.Scanner;

public class Getprime {

	// this methid will check thats prime or not
		static boolean isprime(int x)
		{
			for (int j=2; j<=x/2; j++)
			{
				//	System.out.println(10%2);==0 thats way its going usefull foe ittratiom j=2
				if(x%j==0)
					return false;
					
			}
			return true;
		}
		
		
		static int getprime(int n)
		{
			
			
			for(int i=1; ; i++)
			{
				
			boolean rs=isprime(i);
					if(rs==true)
					{
						n--;
						if(n==0)
						return i;
					}
			}
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int pc=getprime(n);
		System.out.println(n+" "+ "thprime number  is " + pc);
	}
}
//
////enter number
//11
//11 thprime number  is 29
