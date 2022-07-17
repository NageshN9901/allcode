
public class Sample2Aclass  implements Sample2Solutionstep3 {
public void Hello() {
	
	System.out.println("hello word howe are you");
}
public void Welcome()
{
	
System.out.println("Welcpome to my world");	
}

@Override
public void add() {
	// TODO Auto-generated method stub
	
}
public static void sub() {
	System.out.println("tata"); // if static also need present in the implented class otherwise it ownt access
}
// dfalut mertgod are not allowes in implention calss
public static void main(String[] args) {
	Sample2Aclass a=new Sample2Aclass  ();
	a.Hello();
	a.Welcome();
	a.add();
	a.sub();
	a.div();
}

}
