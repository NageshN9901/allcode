
public class MethodoverrideFartuner extends MethodoverrideCar{
	@Override
	void Speeddetils()
	{
		
		System.out.println("180 kmph"); 
	}
	
	
	public static void main(String[] args) {
		MethodoverrideFartuner f=new MethodoverrideFartuner();
		f.model="top ";
		f.color="white";s
		System.out.println(f.model);
		System.out.println(f.color);
		
		f.Speeddetils();
	}
}
//180kmph 