
public class Methodbike {

	
	
	  // not intialztion don we can use any tim es for difrrnt object but if if give 
	//vales here only its not usefull for multple object intailztion =String name;sunil
	String name;
	String color;
	int price;
	
	
	void detils()//method
	{
	System.out.println(name);	
	System.out.println(color);	
	System.out.println(price);	
	}
	public static void main(String[] args) {
		Methodbike b1= new Methodbike();
		
		b1.name="royal enfild"; b1.color="blue"; b1.price=10000;
	
		
		Methodbike b2= new Methodbike();
		
		b2.name="honda"; b2.color="white"; b2.price=20000;
	
		Methodbike b3= new Methodbike();
		b3.name="hero"; b3.color="orange"; b3.price=30000;
		b1.detils(); //method call
		b2.detils(); //method call
		b3.detils(); //method call


	
	
//	Methodbike b1= new Methodbike();
//	Methodbike b2= new Methodbike();
//	Methodbike b3= new Methodbike();
//	
//	b1.name="royal enfild"; 
//	b1.color="blue"; 
//	b1.price=10000;
//	b1.detils();
//	
//	b2.name="honda";
//	b2.color="white"; 
//	b2.price=20000;
//	b2.detils();
//	b3.name="hero";
//	b3.color="orange";
//	b3.price=30000;
	//b3.detils();
	}
//	 we camnt werite any step at anyb time but with match
	
}
