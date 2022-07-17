

	import java.util.Scanner;
	public class PostiveNegtiveCheckking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbervalue");
		int number=sc.nextInt();
		if (number %2==0)
			System.out.println("thisv even number"+number);
		else
			System.out.println("this is odd number"+number);
		
}
}