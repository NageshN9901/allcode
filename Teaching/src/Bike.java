//creat a class bike
//define name color prixce tax
//intilze using constructer
//create 3 objects
//detils name
//color
//selling price (price+tax)
public class Bike {

	String name;
	String color;
	int price;
	int tax;
	
	Bike(String n,String c,int p,int t)
	{
		this.name=n;
		this.color=c;
		this.price=p;
		this.tax=t;
	
	}
	void display()
	{
	System.out.println("name; "+this.name);	
	System.out.println("color  ;"+this.color);	
	System.out.println("sellingPrice; "+(this.price+this.tax));
	//System.out.println("sellingPrice; "+this.price+this.tax); error becuse string +number is string
	
	
	
	
	}
	//int sellingPrice=(price+18%);
	//System.out.println("sellingPrice; "+sellingPrice);
	

	public static void main(String[] args) {
		Bike b1=new Bike("meggi","white",150,18);
		
		Bike b2=new Bike("kitkat","yellow",320,18);
		
		Bike b3=new Bike("lays","red",720,18);
                         b1.display();
                         System.out.println();
                         b2.display();
                         System.out.println();
                         b3.display();
	}

}
