class Product {

	String type;
	double price;
	int quentity;
	
	Product(String t, double p, int q){
		type=t;
		price=p;
		quentity=q;
		
		
		
	}
	public static void main(String[] args) {
		Product p1=new Product("parleG",5, 1);
		System.out.println(p1.type +""+p1.price +""+ p1.quentity);
		Product p2=new Product("book",50, 10);
		System.out.println(p2.type +""+p2.price +""+ p2.quentity);
	
		
	}
	
	
	
	
	
	
	
}
