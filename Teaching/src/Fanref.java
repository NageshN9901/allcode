
public class Fanref {

	
	
	 void Switchon() {}
	 void Switchoff() {}
	 void incresespeed() {}
	
	
	  public static void main(String[] args) {
		
		//  new Fanref().Switchon().
		//  new Fanref().incresespeed().
		//  new Fanref().Switchoff(). it is not usefull becuse every task creating new object it will increase code
		
		  
		  Fanref f =new FanreF();    // it is good because with one object doing multiple tasks
		  f.Switchon();
		  f.incresespeed();
		  f.Switchoff();
		  
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
