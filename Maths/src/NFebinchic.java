

	import java .util.Scanner;
	public class NFebinchic {
		

		static void printfib(int n)
		{
			
			int f1=0,f2=1;
			  
			while(n>0) {
			
				
				System.out.println(f1+"");
				int f3=f1+f2;
				f1=f2;
				f2=f3;
				n--;
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			// need one mthod to perform ome tyask or logic
			printfib(n);
		}

	

}
//	n=4
//	0
//	1
//	1
//	2
