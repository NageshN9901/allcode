

	import java.util.Scanner;
	public class MainBigesat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  3 integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		//int big =a
		
		if(b>a)
			a=b;
		if(c>a)
			a=c;
		System.out.println("biggest"+a);
		
}
}