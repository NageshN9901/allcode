

	import java.util.Scanner;
	public class Numbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number lines number");
		int n=sc.nextInt();
		
		// outer loop for row
		for (int i=1; i<=n; i++) {
			
			// inner llop for column
			for (int j=1; j<=n; j++) {
				
						
					System.out.print(j);
				}// for space between 1 and n
			System.out.println();	
				
			}
				
		}
	}
	


