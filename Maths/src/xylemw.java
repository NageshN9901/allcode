



	import java.util.Scanner;
	public class xylemw {
	public static void main(String[] args) {
	
	
		
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		
			String st=checkXp(n);
			 System.out.println(n+" is"+st+"number");

	}
	
			
			 static String checkXp(int x) {
					 int os=0,ms=0;
					 os=os+x%10;
					 x=x/10;
					 while(x>9)
					 {
						 ms=ms+x%10;
						 x=x/10;}
						 
						 { 
						 os=os+x;
						 
						 if(os==ms)
							 return  "xylem";
						 else
							return "phlome";
									 
						 
					 }
					
					 }
					 
					
			 }

	
