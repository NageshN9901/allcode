



public class Test {
	
		public static void main(String[] args) {
			
		
		
			Car c1=new Car("duke","orange");
			Car c2=new Car("rc 2e0","white");
			bike  b1 =new bike("nano","purplee");
			bike  b2 =new bike("genaral motors","rounddark");
			Object x[]= {c1,c2,b1,b2}; //array storing the 4 objects 
			           // 0, 1,  2,  3 
			Object a=x[2];    // upcasing
		// need value of 0,1,2,3  so 2 value is b1 x[2]  upcasting
			//System.out.println(a.name);
			//System.out.println(a.color);
			//Object x[]= {c1,c2,b1,b2}; //array storing the 4 objects //calsscastexcepton1
			//Object a=x[0];   //classcastexception2
			//bike b=(bike)a; classcastexception3
			bike b=(bike)a; //downcsasting
			b.ride();
		b.drive(); //its is corsponding method of bike class
	
		Object o=x[0];//upcasting for c1 as 0 index value
		
		Car p=(Car)o;// downcasting
		p.speed(); // itis corspondning classas of car
		p.ride();
//			for(int i=0;i<2;i++)
//			{
//				Car c3=(Car)x[i];
//				System.out.println(c3.name+" "+c3.color);
//			
//			}
//				
//				
//		for (int i=2;i<4;i++)
//		{
//			bike b3=(bike)x[i];
//			System.out.println(b3.name+" "+b3.color);
//		}
//			
//		
		for (int i=0;i<x.length;i++)
		{
			if(x[i] instanceof  bike)
			{
				
				bike b4=(bike)x[i];
				System.out.println(b4.name+" "+b4.color);
			}
			else {
				Car c4=(Car)x[i];
				System.out.println(c4.name+" "+c4.color) ;
			}

		}
		
		
		
		}
	}

