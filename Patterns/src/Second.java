import java.util.Scanner;
public class Second {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number lines number");
	int n=sc.nextInt();
	
	// outer loop for row
	for (int i=1; i<=n; i++) {
		
		// inner llop for column
		for (int j=1; j<=n; j++) {
			if(i==1||j==1||i==n||j==n||i==n/2+1||j==n/2+1) {
					
				System.out.print("*");
			}// for space between 1 and n
			else {
			System.out.print(" ");
			}
			
		}
		System.out.println();		
	}
}
}
