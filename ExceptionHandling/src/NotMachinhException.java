// mistake  donnot reapet
public class NotMachinhException {
	public static void main(String[] args) {
		
		
		System.out.println("start");
		System.out.println("statment-1");
		System.out.println("statment-2");
		try {
			//System.out.println("hi");
			System.out.println(100/0);  // we going to put error or exception inside try
		}
		
		
		catch(NullPointerException a)  // the parmaetre pass in catch is type of diffrent from what wrror occured the exception type type difrerent writen 
			{
			System.out.println("this is artimatuc excepton");
		}
		//System.out.println(100/0); 
		System.out.println("statment-3");
	System.out.println("End");
	}
}
//  mistake no=1  dont do this mistake  dont give diff exception for diffrent exception give same in catch

//o/p
//start
//statment-1
//statment-2
//Exception in thread "main" statment-2
//java.lang.ArithmeticException: / by zero
//	at NotMachinhException.main(NotMachinhException.java:10)
