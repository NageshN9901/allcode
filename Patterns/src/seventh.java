





	import java.util.Scanner;
	public class seventh { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number lines number");
		int n=sc.nextInt();
		// one way
//		for(int i=1; i<=n;i++)
//		{
//			
//			int num;
//			if(i%2==0) {
//				
//				num=0;
//				System.out.print(num);
//			}else {
//				num=1;
//				System.out.print(num);
//			}
//			for(int j=1; j<=n; j++)
//			{
//				
//				if(num==1) {
//					num=0;
//				}else {
//					
//					num=1;
//				}
//				System.out.print(num);
//			}
//			System.out.println();
//		}
		
		// outer loop for row
	for (int i=1; i<=n; i++) {
		int num=i%2==0 ? 0:1;
	System.out.print(num);//101010
			for(int j=1; j<=n;j++)
			{
			num=num==1 ?0:1;
//			if(num==1);{
//				num=0;
//			}
//			else {
//				num=1;
//				}				
				System.out.print(num);
			}
		System.out.println();
	}
	}
}
//	101010
//	010101
//	101010
//	010101
//	101010
