import java.util.Scanner;
public class FinalyblockExceptionWithNoMatchingCatchBlock {
public static void main(String[] args) {
	System.out.println("ststrt");
	Scanner sc=new Scanner(System.in);
	try {
		
System.out.println(100/0);//Arthmatic Exception
	}

catch(Throwable y)// no matching catch exception
	{
	
	System.out.println("catch blck");
	}
finally {
	
	sc.close();// closing scanner class
	System.out.println("finally blcok");
	
	
	
}
	System.out.println("End");  

}
}
////o/p
//ststrt
//finally blcok