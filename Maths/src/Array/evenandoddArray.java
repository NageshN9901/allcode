package Array;
import java.util.Scanner;
public class evenandoddArray {




////need to crete one read methods
	int [] readArray()
	
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enetr the siz eof on array");
		int n=sc.nextInt();
		int ar[]=new int [n];
		System.out.println("enetr "+n+"Integrr");
		
		for(int i=0; i<ar.length; i++)
		{
			
			ar[i]= sc.nextInt();
			
		}
		return ar;
	}
		
		// need to display array
		void diaplayArray(int ar[])
		{
			for(int i=0; i<ar.length; i++)
			{
				
				System.out.println(ar[i]);
		
			}
			
		}
		
		/// rhis methoid is for counting
//	public int countprime(int []x)
//		{
//			int count=0;
//			for(int i=0; i<x.length; i++)
//			{
//				
//				boolean rs=isprime(x[i]);
//						if(rs==true)
//							count++;
//			}
//				
//		return count;
//			
//			
//		}
//	
//	
//	// need prime method
//	
//	
//	public boolean isprime(int n) {
//		
//		
//		
//		
//	  for(int i=2; i<n; i++)
//	  {
//		  
//		  
//		  
//		  if(n%i==0)
//			  return false;
//	  }
//	  return true;
//	}
	
       //// OR
	public int countprime(int []x) 
			{
				int count=x.length;///     1,2,3,4  4length
				
				
				for(int i=0; i<=x.length; i++)
				{
					
					
					for( int j=2; j<x[i]; j++)
					{
						
						
						
						if(x[i]%j==0);// 2%2==0 YES // 3%2==0 NO // 4%2==0 YES
					}
					
					
					/// YES 2  //  4  COUNT 2
					count--;// 3// 2// 1// 0
					break;
				
				}
				return count;
			
			
			}
	
	
	
		public static void main(String[] args) {
			
		
		evenandoddArray  ev=new  evenandoddArray();
		System.out.println("read array elemnts");
		int a[]= ev.readArray();
		int pc= ev.countprime(a);
System.out.println("number of prime "+pc);
		
		}
}
