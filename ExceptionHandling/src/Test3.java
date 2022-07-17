
public class Test3 {
public static void main(String[] args) {
		
		
		System.out.println("start");
		
		try {
			System.out.println("try start");  
			System.out.println(100/0);
		}
		
		
		catch(ArithmeticException a)  
		{
			System.out.println("this is catch block");
					
		}
	
	System.out.println("End");
			
	}
}
//there is exception or error code inside the try blcok the control immdetaly comes out from try block checks for same exception tyep
//it never goes back


//o/p
//start
//try start
//this is catch block
//End
