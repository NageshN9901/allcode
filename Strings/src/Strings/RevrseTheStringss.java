package Strings;
import java.util.Scanner;
public class RevrseTheStringss {
//    i/p    ramesh is good boy 
	// o/p    hsemar si doog yob
	
	
	
	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner (System.in);
	
			System.out.println("enetr the string");
	String st=sc.nextLine();// for string using input method
	st=revrseords(st);// method 

	System.out.println(st);
	}
	
	static String revrseords(String st)// method
	{
		//r a m e s h     i s     g  o  o  d
		//0 1 2 3 4 5  6  7 8  9  10 11 12 13 14  // 6,9,14 re spacesss
	char ch[]=st.toCharArray();//onverts this string to a new character array.
	 String rs="";// to store the string values
		for(int i=0; i<ch.length; i++)  // 0 to 14   i=0 , i=1
		{
			
			
			int k=i;//  // 0,1,2,3,4,5,i= 6 /2nd word   9 is space /  7 it is need to reak frm space// //  
			
		while(i<ch.length&& ch[i]!=' ')// //      6 as space not considerable  so it will go next condtion  go up to full length and no to space come out 
		{// 7 //8  but 9 no
			i++;// upto 5 
		}
	   int j=i-1; //   j=6-1 =5//   = 9-1 =8
	  
	   while(j>=k)// 5>=6 yes lesser only  8>=9
	   {
		
		   rs=rs+ch[j];//  itwill revrse 5 to 0    h  s a m e r   s i
		   j--; }
		  if(i<ch.length)// we will every word in full string sentence 
			  rs=rs+ch[i];//  h  s a m e r   si 
		    
		  
				  
	  
		
	
		}
		return rs;
	}
	
	
}
