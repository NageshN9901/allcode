
import java.util.Scanner;
public class DigitOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 3digit value");
	int n=sc.nextInt();
	if (n>=100&&n<=999||n<=-100&&n>=-999)
	System.out.println(n+ "  "+"3 digit number");
	else 
		System.out.println("its not 3 digit numvber");
}
}

