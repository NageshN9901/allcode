import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr even number");
		int n=sc.nextInt();
		if(n/2*2==n)
			System.out.println(n+" " +"is even");
		else 
			System.out.println(n+" " +"this i odd");
	}
	
	
	
	
}
