import java.util.Scanner;
public class SumOfDigit {
public static void main(String[] args) {
//	int num=123;
	System.out.println(123%10);
//	System.out.println(num/10);//12
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number");
	int num=in.nextInt();
	int sum=0;
	while(num>0)// if enter number grtert then 0 it vwill entr insu=ide and gives result unyill condtion fail
	{
		sum=sum+num%10; // 0+1234%10 means intally 4 and 3 and 2 and 1 so total 10
		num=num/10;// 1234/10 means 123 and 2 and 1 and 0 come out side
		
	}
	
	System.out.println("number of digits in sum"+" "+sum);
	
}

}
