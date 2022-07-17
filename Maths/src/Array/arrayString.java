package Array;
	import java.util.Scanner;
public class arrayString {
	

		
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);// to read
			
			System.out.println("eneter size of integer");
			
			//double h b=sc.nextDouble();//  to inbuilt methid to scan upto n
			int n=sc.nextInt();//  to inbuilt methid to scan upto n
			System.out.println("enetr"+n+"Integer");
			String []names=new  String[n];// declration and allction of memeory
			
		for(int i=0; i<names.length;i++)// array first to last 
		{

		names[i]=sc.next();// array index striing in scanner// for to enter value

		}
		System.out.println("user enter array");
		for (int i=0;i<names.length; i++)/// ;

		{
			System.out.println(names[i]);
		}
		
		{
			String hname=names[0];
			for(int i=1; i<names.length;i++)
			if(hname.length()<names[i].length())
				hname=names[i];
			// 
		
			System.out.println("heghtest lenght names    "+hname);	
		}
		
}
}


	     

