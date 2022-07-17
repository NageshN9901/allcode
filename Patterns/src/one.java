import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1; i<=n; i++)// it reprsents  columns
		{
			for(int j=1; j<=n; j++) {// it sfor rows
				if(i%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
				
			}
			
			
			
			
			
			
	
		System.out.println();
		}
	}
}
