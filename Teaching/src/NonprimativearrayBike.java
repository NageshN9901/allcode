public class NonprimativearrayBike {
	String name; //proprtiess
	int price;    
	
	NonprimativearrayBike(String n,int p) //construter//intailzing using constructer
	{
		this.name=n;
		this.price=p;  
		
	}

	public static void main(String[] args) {
		
		
		NonprimativearrayBike m1=new NonprimativearrayBike("intercepeter",1111111);// creating 4 objests
		NonprimativearrayBike m2=new NonprimativearrayBike("duke",222222);
		NonprimativearrayBike m3=new NonprimativearrayBike("ninja-600",33333333);
		NonprimativearrayBike m4=new NonprimativearrayBike("intercepeter",4444444);
		
	//using 	synatx 2
		NonprimativearrayBike s[]= {m1,m2,m3,m4};  // array
		
		//for (int i=0; i<s.length;i++)
		//{
		//System.out.println(s[i]);//object adadress
		//}
		    //NonprimativearrayBike@15db9742
				//NonprimativearrayBike@6d06d69c
				//NonprimativearrayBike@7852e922
				//NonprimativearrayBike@4e25154f
		

		for (int i=0; i<s.length;i++)
		
		{
			
		System.out.println(s[i].name+" "+s[i].price);//object detils
		
	}			//i=3			//3>=0
		for (int i=s.length-1;    i>=0;   i--           )
		{
			
			System.out.println(s[i].name+" "+s[i].price);//object detils
		}	
		
//		
//		for (int i=s.length-1; i>=s.length-2; i--     )
//		{
//			
//			System.out.println(s[i].name+" "+s[i].price);//object detils
//			
//		}	
//		
		
		for ( int i=0; i>=s.length; i++)
		{
			
			System.out.println(s[i].name+" "+s[i].price);//object detils
			
		}	
		

		for ( int i=0; i>=s.length; i++)
		{
			
			System.out.println(s[i].name+" "+s[i].price);//object detils
			
		}	
		
		
		
		
		
	}
}
