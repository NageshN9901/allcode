
public class Test4 {
public static void main(String[] args) {
		
		
		System.out.println("start");
		
		try {
			
			System.out.println(100/0);// its taking
			int x[]= {};
			System.out.println(x[3]);	
		{
			
			}
		
			
			System.out.println("try end");
			
		}
		
		
		catch(ArithmeticException a  )  
		{
			System.out.println("this is catch block");
					
		}
	
	System.out.println("End");
			
	}

}
  //multiple exception can be in try block but only very first exception will rise 

//o/p 
//start
//this is catch block
//End
