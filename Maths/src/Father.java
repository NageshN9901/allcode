
public class Father {
int money=10000;
String car="bmw";
void drink() {
	System.out.println("drink");
	
	
}
}

class son  extends Father{
	String bike="duke";
	
}
class garndson extends son {
	String cycle="hero";
	public static void main(String[] args) {
		garndson g=new garndson();
		System.out.println(g.cycle);
		System.out.println(g.bike);
		System.out.println(g.car);
	}

}


