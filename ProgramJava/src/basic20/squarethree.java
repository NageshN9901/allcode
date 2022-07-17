package basic20;
//read the square side  print area and permeter
	import java.util.Scanner;
public class squarethree {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radis");
		int s=sc.nextInt();
		System.out.println("area"+" "+s*s);
		System.out.println("peremeter"+" "+4*s);
	}
}