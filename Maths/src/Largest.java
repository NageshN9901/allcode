


	import java.util.Scanner;

	public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		System.out.println("enter 2d value");
		int b=sc.nextInt();
		System.out.println("enter3rdvalue");
		int c=sc.nextInt();
		if(a>b&&a>c)  // comparimng with a
			System.out.println("Largest"+a);
		else if (b>a&&b>c)  // omparimng with b
			System.out.println("Largest"+b);
		else 
			System.out.println("Largest"+c);
}
}

