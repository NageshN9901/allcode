import java.util.Scanner;
public class Primecountn {
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
	//now need to countdigitsprime number are there in n

	static int countprime(int ran)
	{
		
		int count =0;
				for (int i=1;i<=ran;i++ )
				{
					boolean rs=isprime(i);
					if(rs==true)
						count++;
				}
	   return count;
		
	}
	
public static void main(String[] args) {
	System.out.println("enerter n");
	Scanner sc=new Scanner(System.in);// redaer
	
	int n=sc.nextInt();// input
	
	//so need one method for read data
	int pc=countprime(n);
	System.out.println(n+"its prime"+pc);
}

}


