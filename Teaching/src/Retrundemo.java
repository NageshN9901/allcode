
public class Retrundemo {
	
	
	
	
	String display1()
	{
		
		System.out.println("display-1");
		
		return null;
		
	}

	public static void main(String[] args) {
		
		Retrundemo d1=new Retrundemo();
		String x=d1.display1();
		System.out.println(x);
		d1.display1();
	}

}
//o/p
//display-1
//null
//display-1