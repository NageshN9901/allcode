import java.util.Scanner;

public class numberpatern {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter number of rows");
 int count =1;
 for(int i=1; i<=n; i++)// 5// for rows
 {
	 
	 
	 for (int j=1;j<=n; j++)
	 {
		System.out.print(count+" ");
		count++;
		if(count==10)
			count=1;
	 }
		System.out.println();
	 }
 }
}

