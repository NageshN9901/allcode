import java.util.Scanner;
public class Maintd {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two digites number");
		int n=sc.nextInt();
		if(n>=10&&n<=99||n<=-10&&n>=-99)
			System.out.println(n+ " "+"its two digit number");
					
		else 
			System.out.println("invalid");
		
	}
}
