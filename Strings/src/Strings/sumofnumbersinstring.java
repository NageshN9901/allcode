package Strings;
import java.util.Scanner;
public class sumofnumbersinstring {
		public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
				System.out.println("enetr the string");
		String st=sc.nextLine();// for string using input method
	int 	s=sumofnumberinwor(st);// method 

		System.out.println(s);
		}
		
		static int sumofnumberinwor(String str)
		{
			// o need add take 0
			int sum=0;
			char ch[]=str.toCharArray();
			for(int i=0; i<ch.length;i++)
			{
				
				int x=0;
				while (i<ch.length&& ch[i]>='0'&&ch[i]<='9')// up lenght and should be 0 to 0  thatas its
				{
					
					x=x*10+(ch[i]-48);//          IT WOKS ON ASCII VALUES     
					// 3=51 5=53 8=56
					// X=0*10+(51-48)     X=3
					//X=3*10+(53-48)   30+(5) X=35
					//X=35*10(56-48)    350+8 =358.
					// 12
					//8
					i++;
				}
				sum =sum+x;// 
				// SUM=0+358=358
				//SUM=358+12=  370
				// SUM=370+8= 378
				// 403
				
			}
			
			
	return sum;
		}

}
