
public class Father  {
static void drinking() {
	
	System.out.println("coffeeee");
}

public static void main(String[] args) {
	//daughter f=new daughter(); IT WORKS BECUSE LHS IS METHOS IS GOING TO WORK O/P WATER
	Father f=new daughter();// new son will give same results
	f.drinking();//because static belongs to class i
	// in place daughetr if we replace with son also no change
	// that only change with lhs change LHS MEANS CLASS RHS MEANS OBJECT
}
}
