
public class Test {
	
	//this is exmple of Method overloading
	//like   multple methods having same name with diffrant signature
	//static {
	//	System.out.println("hio"); static block can be excuteble without object
	//}
static void add() {
	
}


static void add(int x)
{
	
	
}


static void add(String a)
{
	
}


public static void main(String[] args) {
	add(10);        // fallows by 2 nd method//dependen on argumatns and parameter
	add();//fallowed by 1st method
	add("x");// follwed by 3rd method
}
}
//its complie time polymorphsim example