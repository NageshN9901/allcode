
public class Inhercarrot extends InheritVagetable  {
	
	void prepreHalwa() {
		
		System.out.println(" Hot gee palava halawa.............");
		
	}
	public static void main(String[] args) {
		Inhercarrot i1=new Inhercarrot();
		//i1.Quantity="10KG";
		i1.quantity=32;
		i1.price=100;
		System.out.println(i1.quantity);
		System.out.println(i1.price);
		i1.Wash();
		i1.chop();
		i1.prepreHalwa();
	}
	
}
