import java.util.Scanner;
public class fisrtStar {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter num,ber of lines ");
int n=sc.nextInt();
for(int i=1;i<=n;i++)// for columns 
{
	for(int j=1; j<=n;j++)
	{
	System.out.print("* ");
}
System.out.println();
}
}
}
