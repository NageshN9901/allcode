



	import java .util.Scanner;
	public class RetrunFibn {
		

		static int printfib(int n)//5
		{
			
			int f1=0,f2=1;
			  
			while(n>1) {
			
				
				//System.out.println(f1+"");
				int f3=f1+f2;// 0+1= 1>>1
				f1=f2; // 0=1=1>>
				
				f2=f3;// 1=1=1
				n--;//4  >>>>> 
			}
			return f1;
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			// need one mthod to perform ome tyask or logic
			int f=printfib(n);
			System.out.println(n+" "+f);
		}

	

}
//n=10 crspoinging valye finnceh34