
public class VendingMachines {
	
	Object order() // this return type thats way Object is data type
	
	{
		int input =2; // two options there tea and coffee 
		if(input==1) //but need one out put
			
		{
			
			Coffee c=new Coffee();
			return c;

		}
		
		else {
			Tea x=new Tea();
			return x;
		}
	}
	
	
	public static void main(String[] args) {
		VendingMachines v=new VendingMachines();
		Object z=v.order(); //upcastiung
		//Object z=new Tea();
		System.out.println(z);
		Tea t1=(Tea)z;//downmcasting we are downcasted tea thats way tea detail;sa will come 
		t1.teadetils(); // downcasted detils
		
		//Coffee c1=(Coffee)z;//cast class expetionn runtime error
		
	}
	
	
	
}
