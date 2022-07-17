
public class MethodchainBike1 {
	
	
	String name;
	 String color;
	 int price;
	 int tax;
	 

	 MethodchainBike1(String n,String c, int p,int t)
	 {
		this.name=n;
		this.color=c;
		this.price=p;
		this.tax=t;	 	 
	 }
	 
	 void display()
	 {
		 System.out.println("name;"+this.name);
		 System.out.println("color;"+this.name);
		 System.out.println("sellingprice;"+(this.price+this.tax));
		 	 
	 }
	 
	 public static void main(String[] args) {
		MethodchainBike1 b1=new MethodchainBike1("yeppi","redyellow",6778,687);
		MethodchainBike1 b2=new MethodchainBike1("jaga","redyellow",6778,687);

                   b1.display();
                   System.out.println();
                   b2.display();

	}

}
