
public class Methodchain {
	
	
	
	void display1()
	{
		System.out.println("display1");
		this.display2();
	}

	void display2()
	{
		System.out.println("display2");
		
	}
	
	
	public static void main(String[] args) {
		Methodchain  m1=new Methodchain();
		m1.display1();
		
	}

}
