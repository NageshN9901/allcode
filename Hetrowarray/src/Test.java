
public class Test {
	public static void main(String[] args) {
		  Bike b1=new Bike("duke","pink");
		  Bike b2=new Bike("r15","blue");
		  Bike b3=new Bike("tata","red");
		  Car C1=new Car("skoda",122899);
		  Car C2=new Car("benz",122899);
		  Car C3=new Car("maruti",122899);
		  
		  Object z[]= {b1,b2,b3,C1,C2,C3,500,"ABHI"};//ARRAY storing both bike and car objectsSS by assigning object class
		  
		  for (int i=0;i<z.length;i++)
			  
		  {
			  
			  System.out.println(z[i]);
		  }
		  
		  
		  
	}
}
