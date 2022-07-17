
public class Inheritchilly extends InheritVagetable  {
	
	void preprechilly() {
		
		System.out.println(" bhajji is ready.............");
		
	}
	public static void main(String[] args) {
		Inheritchilly i1=new Inheritchilly();
		i1.quantity=50;
		i1.price=500;
		System.out.println(i1.quantity);
		System.out.println(i1.price);
		i1.Wash();
		i1.chop();
		i1.preprechilly();
	}
	
}