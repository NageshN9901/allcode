

	import java.util.Scanner;
	public class ainid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int n=sc.nextInt();

	if(n>=10&&n<=99 ||n<=-10&&n>=-99)
		System.out.println(n+"its is digit");
	else System.out.println(n+" not an two digit number");
	}
	}