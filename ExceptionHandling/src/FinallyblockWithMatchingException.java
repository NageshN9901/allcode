import java.util.Scanner;
public class FinallyblockWithMatchingException {

	
	
	public static void main(String[] args) {
	System.out.println("satart");
	Scanner sc=new Scanner(System.in);
	try {
		
		
		System.out.println("try block");
		System.out.println(100/0);
		int x[]= {};
		System.out.println(x[3]);
	}
	catch(NullPointerException  d)//  inthe place of ArithmeticException: we can write Throwable
	{
		System.out.println("catch-blcok");
		
	}
	catch(ArithmeticException  a  )
	{
		System.out.println("h-blcok");// it will not take only first exception it will take
		
	}
	catch( Throwable v)  // parent it will take arthmaticexception
	{
		
		
		System.out.println("jjj");
	}
	finally
	{
		
		sc.close();
		System.out.println("finally block");
	}
	System.out.println("end");
	}
}




//satart
//try block
//catch-blcok
//finally block
//end
