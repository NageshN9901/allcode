
public class Throwable1 {
public static void main(String[] args) {
	System.out.println("start");
	try
	{
		
		int x[]= {};  // arrayinbound
		System.out.println(x[3]);
		System.out.println(100/0);// Arthimatica
	
	}
	
	
	
	catch(Throwable  e)    //Throwable   its super paremnt of all exception   can except any type of exception
	{
		System.out.println("there is an exceptionn");
		
	}
	System.out.println("enn");
}
}
//o/p
//start
//there is an exceptionn
//enn
