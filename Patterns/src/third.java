
	import java.util.Scanner;

public class third {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter num,ber of lines ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=n; j++) {
		
			
			if(i==1||i==n||j==1||i==n||j==n||i==j||i+j==n+1) {
				
				System.out.print("*");
				
				}else {
					System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
//for (int i=1; i<=n; i++) {
//	
//	// inner llop for column
//	for (int j=1; j<=n; j++) {
//		if(i==1||j==1||i==n||j==n||i==j||i+j==n+1){
//				
//			System.out.print("*");
//		}// for space between 1 and n
//		else {
//		System.out.print(" ");
//		}
//		
//	}
//	System.out.println();		
//}