

	import java.util.Scanner;
	public class PostiveNegtiveCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbervalue");
		int number=sc.nextInt();
		if(number>=0)
			System.out.println("it is postive number"+number);
	
		else if(number<0)
		
			System.out.println("it is negtive number"+number);
	
		//else 
			//System.out.println("it is zero"+number);

		
}
	
}