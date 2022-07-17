import java.util.Scanner; 
public class pyrmid22 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n;i++)//Rows
		{
			for (int j=1; j<=n-1;j++)// 4//3//2//1// sapcing
			{
				System.out.print(" ");
			}
			int k=1;
			for(int j=1; j<=2*i-1;j++)
			{
				System.out.println(k+"");
				if(j<i)
					k++;
				else
					k--;
				
				
			}
			System.out.println();
		}
	}
	}


