
import java.util.Scanner;
public class Mainprimnth {
	
	
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
		static void printprime(int n)
		{
			for (int i=1;n>=0;i++)// becuse 1 is also rime and n>0 should be
			{
				
				
				boolean rs=isprime(i);
				if(rs==true)
				{
		System.out.println(i+"");
		n--;
		}
			}
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter n");
		int n=sc.nextInt();
		printprime(n);// methof need 1
	
	}
	
}
//10
//1
//2
//3
//5
//7
//11
//13
//17
//19
//23
//29



}
