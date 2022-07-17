

	import java.util.Scanner;
	public class MainPositive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 integer value");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double diff=a-b;
		if(diff<0)
			diff=diff*-1;
		System.out.println("diff"+diff);
}  
}