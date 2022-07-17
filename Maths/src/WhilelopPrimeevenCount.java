

	import java.util.Scanner;
	public class WhilelopPrimeevenCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int n=sc.nextInt();
		int evensum=0;
	int 	oddsum=0;
	int 	start=1;
	while(start<=n)// if entring number is less rthan 1 it eill not enter inside
	{
		
		if(start%2==0)
		{
			evensum=evensum+start;
			
		}
		else {
			oddsum=oddsum+start;
		}
		start++;//  take input as 4 , 1 go to while loop yes 1<4 yes enter inside while loop 
//		so 1%2==0 no so else part will excute so 0=0+1  so evsum 1 and agin come to strat++ now 2 
//				go  to while yes 2less then 4 enter inside so if condtion 2%2 ==0 yes if part evensum excute there 
//				0=0+2  so evensum=2
//				agin come to strat++ now 3 go to while yes 3<4 enter  check if 3%4==0 
//				not 0 so else part wille excute  like alerdy we have0=0+1  evenodd =1 so now 1=1+3 =4 oddsum=4
//				so 4 now agin comes to inceremnet part start++ now its 4 got while 4<=4 yes enetr inside 
//				if condtioin 4%4==0 yes 0 evensum go to if evensum part wille xcute 
//				alerdy it is  0=0+2 so evensum=2 now 2=2+4 so evensum= 6 
	}
	System.out.println(evensum);
	System.out.println(oddsum);
	//System.out.println(1%2);
		
}
}