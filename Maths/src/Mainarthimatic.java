import java.util.Scanner;
public class Mainarthimatic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first value");
	int a=sc.nextInt();
	System.out.println("enter second value");
	int b=sc.nextInt();
	
	System.out.println("sum"+" "+(a+b));
	System.out.println("diff"+" "+(a-b));
	System.out.println("product"+" "+(a*b));
	System.out.println("quatiny"+" "+(a/b));
	System.out.println("remionder"+" "+(a%b));

}
}
