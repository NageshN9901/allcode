


	import java.util.Scanner;
	public class MainPerfect {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number value");
		int n=sc.nextInt();// 28
		int sum=1;//becuse strt value
	
		System.out.println(28%28);
	for (int i=1;i<n;i++)
	{
		
		if (n%i==0)  // it strat with n=1and i=1  true it will go further and n=2 and i=2 
			// it stake n=6 i=6 so after that thre is no input  termente
		
			sum=sum+i;
	}
	if (sum==n)///6=6 given and final after addtion
		System.out.println(n+"perfect numvber sum is "+sum);
	
	
	else 
		System.out.println(n+"not sis perfect number"+sum);
	
}
}