import java .util.Scanner;

public class PrimeWithInn {
	// this method is going check prime are notwdc                    
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
		System.out.println("eneter number");
		int n=sc.nextInt();//100//1
		for (int i=1; i<=n; i++)////2 why means prime number srat from 1 and upto n but inside with in n
			// should not excced n
		{
			boolean rs=isprime(i);// retruing
			if(rs==true)
				System.out.println(i+" ");
			
		}
		
		
	
	}

}
