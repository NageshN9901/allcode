
public class Consumar110Step6 {

	
	public static void main(String[] args) {
		//FanIMPL r = new FanIMPL();
		Inf0Step5 r = new FanIMPL0Step4();  // error Inf is extended class and fanmpl is implented class
		r.switchon();
		r.switchoff();
		r.repir();
		r.reducespeed();
		r.increasespeed();
		
		Inff20Step3.speed();  // why means after onwards 1.8 jdk interface allowing to craete 
		//static methods with body but we need call by using interface name
	}
}

//6 by class   calling
