import java.util.Scanner;
public class HowPrimeDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		do {
			
			int r=n%10;
			if(r==1||r==2||r==3||r==5||r==7)
				count++;
			n=n/10;
		}while(n!=0);
		System.out.println(count);
	}
		
//		static int countdigit(int n)
//		{
//			int count=0 ,temp=n;
//			while(temp!=0);{
//				int r=temp%100;
//				temp=n/10;
//				if(r==1||r==2||r==3||r==5||r==7)
//					count++;
//		}
//		return count;
//		
//	}
//		public static void main(String[] args) {
//			Scanner sc=new Scanner(System.in);
//			int n=sc.nextInt();
//			System.out.println(countdigit(n));
	}
	
	

