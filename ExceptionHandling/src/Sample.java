import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		
		
		int n=Integer.parseInt(sc.nextLine());
		if(99%n==0)
			System.out.println(n+" "+"is factor of 99");
	}
	
	catch(ArithmeticException e)
	{
		
		System.out.println(" thios is ArithmeticException "+e);
	}
	
	catch(NumberFormatException e)
	{
	System.out.println("Number Formats Exception");
}
}
}
// if i give string ype it is numberformet exception
//o/p
//jj input
//Number Formats Exception

//if i give number
//0  input  only 0 works 
//thios is ArithmeticException java.lang.ArithmeticException: / by zero

