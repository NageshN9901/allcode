

	import java.util.Scanner;
	public class MethodxylemPhlem {//s
	public static void main(String[] args) {//m
	
	
		
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			//retrunig pattern in String so need to write method with sTRING TYPE 
			String st=checkXp(n);// retunring out put in form
			 System.out.println(n+"  is  "+st+" number ");// here st is  
	}
	
	// onther way
//	static String checkXp(int x)  {
//		int os=0,ms=0,t=x;
//		do {
//			int d=x%10;// 36317%10  = 7,1,3,6,3
//			if(x==t||x==d)
//				os=os+d;
//			else 
//				ms=ms+d;
//			x=x/10;// now 3631,363,36,3
//		}while(x!=0);
//		if(os==ms)
//			return "xylem";
//		else 
//			return "phlem";
			
			
					
	
//			//WITHOUT OBJECT WE NEED TO DO method 
		 static String checkXp(int x) // pass 36317
			 {
				 int os=0,ms=0;// why means we need add the some operation so intally take 0
				 os=os+x%10;//   36317%10  means 7 its going stoe last number into os=7
				 x=x/10;// here we are ging remove 7  36317/10  now x=3631
//					 // so we need take first so   
					 while(x>9)// becasue 3631>9 means when itertion comes to single first digit it will stop
					 {
					 ms=ms+x%10;// 0=0+3631%10 = ms=1 next ms=3 next ms=6 after it will stop becuse while condtion 3>9 no 
					 x=x/10;// 3631/10 = 361 and 361/10= 36, 36/10=  6    wso remaining 3 is not greter then > so it will stop
					 }
					 {
					 
					 os=os+x;// os=last x= after 25 line code x=3 so last   os=7+3=10
					 // take into considertuion of that block onlye
			
					 if(os==ms)
							 return  "xylem";
						 else
						return "phlome";
								 
						 
						 }
				
					 }//m

			 }

	