
public class MethodOverSon extends MethodoverFather {
	
	// subclass of super class 
	//3rd program

	
//	@Override
//	void drinking()
//	{
//		
//		System.out.println("water");   // mthodoverriding means chaning method behvoir in particular classs
//		//example in super class =coffe but in subclass = water
//	}
	
	public static void main(String[] args) {

		MethodOverSon s= new MethodOverSon();
		System.out.println(s.car);//nano
		System.out.println(s.money);//5000000
		s.drinking();//water
	}

}
//o/p
//nano
//500000000
//Horilicks