

	import java.util.Scanner;
	public class MainDaysMonth {

		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter month numbernumber");
			int m=sc.nextInt();
			if(m>=1&&m<=12)
				System.out.println("its valid manioth numvber");
			else 
				System.out.println("its notvalid number");
		}
}
