
public class MethodreturNonPubg extends MethodreturnNonPub {
	

//	class Gun{}
//	
//	class Pan{}
//	class Bomb{}

	Gun button1()
	{
	Gun g=new Gun();
		return g;
	}
	
	Pan button2() { 
		
		Pan p=new Pan();
		return p;
		}
	Bomb button3()
	{
		Bomb b=new Bomb();
		return b;	
	}
	
	
	
	public static void main(String[] args) {
		
		MethodreturNonPubg m=new MethodreturNonPubg();
		Gun a=m.button1();
		System.out.println(a);
		m.button1();
		System.out.println(m.button1());
	
		Pan b=m.button2();
		System.out.println(b);
		Bomb c=m.button3();
		System.out.println(c);
		
	}
}
