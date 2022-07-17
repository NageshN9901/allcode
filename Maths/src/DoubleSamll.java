

	import java.util.Scanner;

	public class DoubleSamll {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		double a=sc.nextDouble();
		System.out.println("enter first value");
		double b=sc.nextDouble();
		System.out.println("enter first value");
		double c=sc.nextDouble();
		if(a<b&&a<c)
			System.out.println(a+"small");
		else if (b<a&&b<c)
			System.out.println(b+"small");
		else 
			System.out.println(c+"small");
	}
		
}