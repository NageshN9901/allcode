import java.util.Scanner;
public class arraow {
	

		


			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
			
				for (int i=1; i<=n; i++)// it rows
				{
					for(int j=1;j<=i;j++)/// why i taken becuse of i is corrctly changing with results
					{ 
					System.out.print("* ");
					}
					
				System.out.println();// to gump next line
				}
				
				for (int i=n-1; i>=1; i--)// it rows
				{
					for(int j=1;j<=i;j++)
					{ 
					System.out.print("* ");
					}
				System.out.println();
					}
				}
			
			}
	

	

