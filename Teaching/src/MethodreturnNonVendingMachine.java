
public class MethodreturnNonVendingMachine {
	
	class coffee{}
	class tea{}  // writen class inside this class
	coffee button1()// coffee is retunb type and button is name of Method      
	{
		coffee c=new coffee();//for non primative data type is same name given to object name 
		return c;
	}

	
	
	tea button2()
	{
		tea t=new tea();//for non primative data type is same name given to object name 
		return t;
	}
	
	
	
	public static void main(String[] args) {
		MethodreturnNonVendingMachine m=new MethodreturnNonVendingMachine ();
		coffee x= m.button1();//coffee is non primative datatype
		System.out.println(x);
		tea y=m.button2();//tea is non primative datatype
		System.out.println(y);
	
	}
}
