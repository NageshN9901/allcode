import java.util.Scanner;
public class ArmStrong {
public static void main(String[] args) {
	 int rem=0, cube=0 ;
			 
	
	 System.out.println("enter number");
	 Scanner sc=new Scanner(System.in);
	 int number=sc.nextInt();
	int  c = number;
	
	 while(number>0)
	 {
		 // we need to know how many nubers are there so use %10 like remineder
		 rem=number%10;
		 // we need cube the each digit
		cube=(rem*rem*rem)+cube;
		//we need to elmante last alst digit one by one
		number=number/10;
		
		 
	 }
			if(c==cube)
			System.out.println("yes"+" "+cube);
			else
				System.out.println("no"+" "+cube);
	
}
}
