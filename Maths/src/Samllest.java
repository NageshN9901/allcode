

	import java.util.Scanner;
	public class Samllest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int a=sc.nextInt();
		System.out.println("enter 2d value");
		int b=sc.nextInt();
		System.out.println("enter3rdvalue");
		int c=sc.nextInt();
		if(a<b&&a<c)  // comparimng with a
			System.out.println("smallest"+a);
		else if (b<a&&b<c)  // omparimng with b
			System.out.println("smallest"+b);
		else 
			System.out.println("smallest"+c);
}

	}