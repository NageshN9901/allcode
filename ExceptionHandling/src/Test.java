
public class Test {
public static void main(String[] args) {
	System.out.println("start");
	System.out.println("statment-1");
	System.out.println("statment-2");
	System.out.println(100/0);   //the error line called Risky code
	System.out.println("statment-3");
System.out.println("End");
}
}

//
//start
//statment-1
//statment-2
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at Test.main(Test.java:7)


//it is the example for Arthmaticexception or runtimeerror