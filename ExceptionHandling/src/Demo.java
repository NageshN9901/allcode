
public class Demo {
	public static void main(String[] args) {
		
	
	System.out.println("start");
	System.out.println("statment-1");
	System.out.println("statment-2");
	try {
		System.out.println(100/0);  // we going to put error or exception inside try
	}
	
	
	catch(ArithmeticException a)  // the parmaetre pass in catch is type of exception means type of err
	{
		System.out.println("this is artimatuc excepton");
	}
	//System.out.println(100/0); 
	System.out.println("statment-3");
System.out.println("End");
}
}
//start
//statment-1
//statment-2
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Demo.main(Demo.java:10)
//  o/p
//  start
//  statment-1
//  statment-2
//  this is artimatuc excepton
//  statment-3
//  End
