
public class StaticNonstaticsimplfy {

	
	
	int x= 100;
	static int y=200;
	void display() // its non static method it takes both 
	{
		
		System.out.println(x);
		System.out.println(y);
	}
	
	static void dispaly2()
{
		
		System.out.println(x); //this giving error due to static   method only take static varibles with in satic scope we cant accss non
		System.out.println(y);
		
	}
	
	
	
	
	
	static void display3()
	
	
	{
		StaticNonstaticsimplfy s=new StaticNonstaticsimplfy();
		System.out.println(s.x);
		
		
			
		
		
	}
	public static void main(String[] args) {
		
	}
//	static void display3()
//	{
//		
//		StaticNonstaticsimplfy s=new StaticNonstaticsimplfy();
//		System.out.println(s.x);
//	}
}
