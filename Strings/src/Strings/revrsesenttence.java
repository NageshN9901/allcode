package Strings;
import java.util.Scanner;
public class revrsesenttence {

		//   i/p hi all good 
		// o / p  good all hi 
		
		
		public static void main(String[] args) {
			
			
		Scanner sc=new Scanner (System.in);
		
				System.out.println("enetr the string");
		String st=sc.nextLine();// for string using input method
		st=revrseordSntencess(st);// method 

		System.out.println(st);}
		
	      static String  revrseordSntencess(String st)
	      {
	    	  char ch[]=st.toCharArray();
	    	  String rs="";
	    	  for (int i=ch.length -1; i>=0; i--)
	    	  {
	    		  
	    		  int k=i;
	    		  while (i>=0&& ch[i]!=' ')
	    		  {
	    			  i--;
	    		  }
	    		  int j=i+1;
	    		  while (j<=k) {
	    			 rs=rs+ch[j];
	    			 j++;
	    		  }
	    		 if(i>=0)
	    		 {
	    			 rs=rs+ch[i];
	    		 }
	    		
	    	  }
			return rs;
	    	  
	    	  
	      }
}
