

	import java.util.Scanner;

	public class Sample2OF1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			
			
			int n=Integer.parseInt(sc.nextLine());
			if(99%n==0)
				System.out.println(n+" "+"is factor of 99");
		}
		
		catch(ArithmeticException |NumberFormatException e)
		{
			
			System.out.println(" thios is ArithmeticException "+e);
		}
}
	}
	  // this all inputmethods
//	//fro string type data
//	hgg
//	 thios is ArithmeticException java.lang.NumberFormatException: For input string: "hgg"
//   if belongs to 0
//   0
//   thios is ArithmeticException java.lang.ArithmeticException: / by zero
