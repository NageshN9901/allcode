import java.util.Scanner;

public class ChcekARm {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String st=check(n);
	System.out.println(n + " "+st+" armstrong number");
}

static String check(int x)
{
int temp=x,sum=0;
int dc=x+" ".length();
do {
	
	int r=x%10;
	sum=sum+(int)Math.pow(r, dc);
	x=(x/10);
}while(x!=0);
if(sum==temp)
	return  "yes";
else
	return "not";

}

}



