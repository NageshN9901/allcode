
public class Bike {
Bike()
{
	System.out.println("b1");
}


Bike(int x)
{
	this();
	System.out.println("b2");
}
public static void main(String[] args) {
	Bike b=new Bike (5);
}
}
//need make connection b/w parent by parmeter construceter so pass thisb ();