
public class Product {
	
	String type;
	int quanty;
	double money;
	Product(String a,int b, double c){
		
		type=a;
		quanty=b;
		money=c;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product  p1=new Product("cloths",2,1000);
		Product  p2=new Product("ready",9,2000);  //should not use + in between data( like ready+2+2000 it will not work)
		
		System.out.println(p1.type+"  "+ p1.quanty+"  "+p1.money);
		System.out.println(p2.type+" "+p2.quanty+" "+p2.money);
	}
	

}
