import java.util.Scanner;

public class Betweenprime {

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
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter");
			int m=sc.nextInt();
			int n=sc.nextInt();
			for(int i=m;i<=n;i++)
			{
				boolean rs=isprime(i);///// it will tahts corspoing parameetr//6>>>if true >>25>>>26
				if(rs==true)
					System.out.println(i+"");
				
			}
		}
}
