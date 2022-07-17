import java.util.Scanner;
public class Revers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int rem=0;
		int rev=0;
		while(n>0)
		{
			
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
			
		}
		System.out.println("revrse numbeer"+rev);
	}

}
