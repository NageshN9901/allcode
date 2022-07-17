
public class Grabages {

	public void finalize() {
		
		System.out.println("clean up dome");
	}
	
	
	
	public static void main(String[] args)
	{
		Grabages w=new Grabages();
		Grabages w1=new Grabages();
	w=null;
	w1=null;
	System.gc();
		
	}
}
