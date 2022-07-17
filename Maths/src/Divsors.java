



	import java.util.Scanner;
	public class Divsors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number value");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
			if(n%i==0)// passing 6%1==0 yes and 2yes 3 yes 4 no 5 no 
				System.out.println(i);
//			else
//				System.out.println( i);  //not needed
//	
}
}