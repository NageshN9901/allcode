import java.io.*;
//this throws concpt is just indacting to next user this has exception

public class ThrowsIndcating {

public static void main(String[] args) throws ArithmeticException,FileNotFoundException
{
	System.out.println("some code sratsr");
	System.out.println(100/0);//arth
	FileReader f=new FileReader("demo .text");//file,
	System.out.println("some code end");
}
}

//some code sratsr
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ThrowsIndcating.main(ThrowsIndcating.java:9)

class dem
{
	public static void main(String[] args) throws ArithmeticException
	
	{
		System.out.println("k");
		System.out.println("100/0");
		System.out.println("e");
	}
}
//k
//100/0
//e
