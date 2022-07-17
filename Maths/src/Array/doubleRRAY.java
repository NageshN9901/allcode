package Array;
import java.util.Scanner; 

public class doubleRRAY {
	
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr  Integer");
		int n=sc.nextInt();// read 
		System.out.println("enetr  "+n+"Integer"); 
		
		double dr[]=new double [n];// stroing in double array
	System.out.println("stroe and one by one in array");
	for(int i=0;i<dr.length;i++)
	{
	dr[i]=	sc.nextInt();	
		
	}
	System.out.println("storeed displayed in one array");
		for(int i=dr.length-1;i>=0; i--)
		{
			
			System.out.print(dr[i]);// 3   1.02.03.0
		//	so we need comm in between
			if(i>0||dr[i]<i)
				System.out.print(",");
		}
	
}
}
