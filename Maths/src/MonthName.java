

	import java.util.Scanner;
	public class MonthName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month numbervalue");
		int n=sc.nextInt();
		if(n==1)
		
			System.out.println("jan 31 days");
		
		else if(n==2)
			System.out.println("fab 28 days");
		else if(n==3)
			System.out.println("march 31 days");
		else if(n==4)
			System.out.println("April 28 days");
		else if(n==5)
			System.out.println("may 31 days");
		else if(n==6)
			System.out.println("june 30 days");
		else if(n==7)
			System.out.println("july 31 days");
		else if(n==8)
			System.out.println("aug 31 days");
		else if(n==9)
			System.out.println("sept 30 days");
		else if(n==10)
			System.out.println("oct 31 days");
		else if(n==11)
			System.out.println("nav 30 days");
		else if(n==12)
			System.out.println("dec 31 days");
		else 
			System.out.println("invalid number");
		
}
	}
