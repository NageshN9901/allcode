
public class test1 {

int a=10;
public static void main(String[] args) {
}
}

class pen1e extends test1{
	 int b=20;
	
	public static void main(String[] args) {
		test1 t= new test1();

		
		System.out.println(t.a);
		
		pen1e p= new pen1e();
		
		System.out.println(p.b);
	}
}