// when to use multple catch block means if the handling scenrio  same then we go for multple catch block
public class multipleExceptionHnadleing {
public static void main(String[] args) {
	System.out.println("stsrt");
	try {
	System.out.println(100/0); //it will print first exception is accepted if sutable catch block present means
		int x[]= {};
		System.out.println(x[3]);
		System.out.println(100/0);
	}
	
	
//	catch(ArrayIndexOutOfBoundsException |ArithmeticException e)  
//	
//	{
//		
//				
//				System.out.println("hi");
//	}
//	catch(ArrayIndexOutOfBoundsException  | ArithmeticException j)  
//	
//	{
//		
//				
//				System.out.println("hi");
//	}
	
		catch(ArrayIndexOutOfBoundsException t)  
		
		{
			
					
					System.out.println("hi");
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Hello");
		}
	catch(Throwable j)
	{
		System.out.println("parent of all exception takes all");
	}
}

}
//stsrt
//Hello

// sinle catch block when we have to handle same type of exception go with single catch block
class SinglecatchBlock {
public static void main(String[] args) {
	System.out.println("is exmple for single block");

	
	try {
		int x[]= {};
		System.out.println(x[3]);
		System.out.println(100/0);
		
	}
	
	
	catch(Throwable r)
	{
System.out.println("go");
}
}
}

//o/p
//stsrt
//Hello
