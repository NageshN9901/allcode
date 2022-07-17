//i  if there is know excception finally block excutes

import java.util.Scanner;
public class FinallyBlockWithNoExceptionInTryblcok {
public static void main(String[] args) {
	System.out.println("some code 1");
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("Try blcok");
	}
	
	catch(Throwable r)
	{
		System.out.println("catch block");
	}
	
	
	
	finally {
		sc.close();
		System.out.println("finally blcok");
	}
	System.out.println("some code2");
}
}
////some code 1
//Try blcok
//finally blcok
//some code2