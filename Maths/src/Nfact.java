


	import java.util.Scanner;
	public class Nfact {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number value");
		int n=sc.nextInt();//5
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
}
}