package surendraPrograms;

import java.util.Scanner;

public class fabanossi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=0,n2=1,sum=0;
System.out.print(n1+""+n2);
for(int i=2;i<=n;i++)
	
{
	sum=n1+n2;
	System.out.print("  "+sum);
	n1=n2;
	n2=sum;
}


	}

}