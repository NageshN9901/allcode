



	import java.util.Scanner;
	public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  number value");
		int n=sc.nextInt();//5
		
		int evensum=0,oddsum=0; //why means i%2 0%2 =0 so its waste
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
		{
			
			evensum=evensum+i;
		}
		else 
		{
			oddsum=oddsum+i;
		}
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}
	}

