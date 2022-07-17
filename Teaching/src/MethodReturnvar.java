
public class MethodReturnvar {
	
	int dis()
	{
		
		
		System.out.println("Returing value");
		int x=10;
		return x;
	}

	public static void main(String[] args) {
		MethodReturnvar m1=new MethodReturnvar();
		int z=m1.dis();  // int is type of return data given in line number 4 is method return data and z=some contaner
		System.out.println(z);
		System.out.println(m1.dis());// 2nd way but sutbale v further operton

	}

}
//o/p
//Returing value
//10
//    