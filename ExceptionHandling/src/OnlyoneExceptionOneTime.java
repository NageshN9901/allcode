
public class OnlyoneExceptionOneTime {
public static void main(String[] args) {
	System.out.println("start");
	try {
		System.out.println(100/0);// arthmatic  1
		int x[]= {};  //arrayindex
		System.out.println(x[3]);
	}
	
	
	
	catch(ArithmeticException w)  //passing arthmatic exception to first risky code  1
	{
		System.out.println("there is arthmatic exception");
	}
	
	catch(ArrayIndexOutOfBoundsException t)
	{
	System.out.println("theree is arrayindex exception");
	}
	
	
	
	System.out.println("end");
}
}
//start
//there is arthmatic exception
//end
