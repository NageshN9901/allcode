
public class Test1 {
	public static void main(String[] args) {
		
		
		System.out.println("start");
		System.out.println("statment-1");
		System.out.println("statment-2");
		try {
			System.out.println("try block");  
		}
		
		
		catch(ArithmeticException a)  
		{
			System.out.println("this is catch block"
					+ "");
		}
	
	System.out.println("End");
			
	}
}

  //mistake no=2 there is no exception inside try block a
//o/p
//start
//statment-1
//statment-2
//try block
//End
