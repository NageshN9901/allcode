
public class gomoto extends InherDelivary {
	
	void ratings() {
		System.out.println(" gomoto ratings are 4.2");
	}
         
	
	//super.InherDelivary();

	public static void main(String[] args) {
		gomoto g=new gomoto();
		g.time=15;
		g.charge=180;
		g.dish="dam dum Biryani";
		g.order();////delvary time is 25 minutes 
		g.freeorder();//if more than 25 minute get free orders
		System.out.println("time in minutes"+" "+g.time);//time in minutes 15
		System.out.println("total inculde all charges;"+" "+g.charge);//total inculde all charges; 180.0
		System.out.println("dish ;"+" "+g.dish);//dish ; dam dum Biryani
		
		
		

	}

}
