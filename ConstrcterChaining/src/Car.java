
public   class Car {
	//public abstract  class Car
	Car(){
		
		
		
		this(55); // s1.car(55)  // 55  flowed by int with zero pareemetrt  becuse 
		System.out.println(100); // follwed by  zero paremetrt 
	}
	
	Car(int x){
	this("17",40); // s1.car ("s" int); // 40  return by string super calling parent with zero parmetyer  so here 2 are thgere but parerameter is int 
	System.out.println(x);
}
	
	Car(String y){
		
		super();
		System.out.println(567);} //  567 sfirst falowwed by string and int
	
		
Car(int x,String y){
		this();// s1.car();
		System.out.println(x);
	}
	
	
	Car( String a,int b)
	{
		
		this("95"); //s1.car(string);
		
		
		System.out.println(b);
		
	}
	
	
	public static void main(String[] args) {
		Car c=new Car(10,"15");
	}
}
//567
//40
//55
//100
//10
