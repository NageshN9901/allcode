
public class Methodadvacncechain {
	
	String name;
	String color;
	int price;
	int tax;
	
	
	Methodadvacncechain(String n,String c,int p,int t)
	{
		this.name=n;
		this.color=c;
		this.price=p;
		this.tax=t;
	}
	
	
	void sellingprice()
	{
		int sellingprice=this.price+this.tax;
		System.out.println("sellingprice; "+sellingprice);//e can keep fulname or short form
	}
	void display()
	{
		System.out.println("name; "+this.name);
		System.out.println("color; "+this.color);
		this.sellingprice();
		
	}

	public static void main(String[] args) {
		Methodadvacncechain m1=new Methodadvacncechain("honda;","white",6766,7656);
		m1.display();		
		m1.sellingprice();
	}

}
