
public class maggi extends InherDelivary {
	// extends word take information from or acqaure proprtyes from parent or superscalss
	
	void armor()
	{
		
		System.out.println("the best dishes ever seeen in taste of heavean ");
	}

	public static void main(String[] args) {
		

		maggi m= new maggi();// every time object  should belong to same class not inherted caLSS NAME
		m.armor();

		m.time=17;
		m.charge=160;
		m.dish="veg palava";
		m.order();
		m.freeorder();
		
		System.out.println("time in  minutes ;"+" "+m.time);
		System.out.println("mega offer  ;"+" "+m.charge);
		System.out.println("dish ;"+" "+m.dish);
		
		
	}

}
