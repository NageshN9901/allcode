import java.util.Scanner;
public class tpatern {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter num,ber of lines ");
	int n=sc.nextInt();
	for(int i=1; i<=n; i++)
	{
		
		
		for (int j=1; j<=n; j++)
		{
			
			
			if(j==n/2+1||i==1||i==2)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
