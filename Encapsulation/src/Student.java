
public class Student {
// make it varible as pricvate for securty are handiling the data   >>>>1
	private String name;
	private int age;
	private double perc;   
	
	
	
	
	// setter method // intailze tyhe varible by making private varible into public  >>>>>>2
	
	
	public  void setname(String s)  // method with one parameter that is varible datataype
	{
		
		this.name=s;
	}
	
	
	
	//we need to make data handlimg or avoid data missdhandling so wee nedd make some condtion for age>  condetion   >>>>3
	public void setage(int a)
	{
		if(a>=0 && a<=100)  // age must be 0 to 100  && And operter  means both condtion should treue
			this.age=a;// intalizing into age=a
		else 
			System.out.println("Invalid age");
}
	
	public void setperc(double p)  // for perc need set condtion for maintin data handling
	{
		if(p>=0&&p<=100)
			this.perc=p;
		else 
			System.out.println("invalid percntge");
		
	}
	
	//Getter method used for to raed the value   >>>>>>4
	
	
	public String getname() // here the return type used return the varibles
	{
		
		return this.name;  //name=varible name
	}
	
	public int getage()

	{
		return this.age;//name=varible age
	}
	
	public double getperc()
	{
		
		return this.perc;//name=varible perc
	}
}
