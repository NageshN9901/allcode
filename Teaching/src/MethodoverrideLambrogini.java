
public class MethodoverrideLambrogini extends  MethodoverrideCar {
	
	
	void Speeddetils()
	{
		System.out.println("280 kmph");
	}
	public static void main(String[] args) {
		MethodoverrideLambrogini m=new MethodoverrideLambrogini();
		m.model="gallordo";
		m.color="yellow";
		System.out.println(m.model);
		System.out.println(m.color);
		m.Speeddetils();
	}

}
