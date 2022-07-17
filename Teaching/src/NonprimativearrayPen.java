// by object reefrnce data passing
public class NonprimativearrayPen {
	String brand;
	String color;
	int price;

	NonprimativearrayPen(String b,String c,int p)
	{
		this.brand=b;
		this.color=c;
		this.price=p;
	}
	
	public static void main(String[] args) {
		NonprimativearrayPen p1 = new NonprimativearrayPen("benz","white",14141);
		NonprimativearrayPen p2 = new NonprimativearrayPen("BMW","bl5e",2241414);
		NonprimativearrayPen p3 = new NonprimativearrayPen("tata","dark",3141414);
		NonprimativearrayPen p4 = new NonprimativearrayPen("trtata","drfrark",3141414);
//		p1.brand = "benz";
//		p1.color = "white";
//		p1.price = 141414;
//		p2.brand = "BMW";
//		p2.color = "blue";
//		p2.price = 2241414;
//		p3.brand = "tata";
//		p3.color = "dark";
//		p3.price = 3141414;

//		NonprimativearrayPen p[] = { p1, p2,p3 };
//
//		for (int i = 1; i < p.length; i++) // forward derction
//		{
//
//			System.out.println(p2.brand + "  " + p2.color + " " + p2.price);
//			System.out.println(p3.brand + "  " + p3.color + " " + p3.price);
//
//		}
//
//		for (int i = p.length; i>=0; i--) {
//
//			System.out.println(p2.brand + "  " + p2.color + " " + p2.price);
//			System.out.println(p3.brand + "  " + p3.color + " " + p3.price);
//
//		}
//		System.out.println(p.length);
		NonprimativearrayPen p[] = { p1, p2,p3,p4 };
		
		//                             0, 1,2,3// 2 3 need a
		System.out.println("detils laast 2 objects ");
		for(int i=p.length-2;i<=p.length-1;i++)
		{
			
			System.out.println(p[i].brand+p[i].color+p[i].price);
			
		}
		
	

	}

}
