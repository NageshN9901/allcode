

public class OverrideHashcode {
	
	int d;
	int salary;
	String name;
	
	@Override
	public int hashCode() {
		
		
		return this.d;
	}
	public static void main(String[] args) {
		OverrideHashcode p=new OverrideHashcode();
		p.d=44;   p.name="nag";   p.salary=77778787;// varible intliztion through object reffrence
		
		p.d=44;   p.name="nag";   p.salary=77778787;
		System.out.println(p);//HashcodeMethod@15db9742
		System.out.println(p.hashCode());//366712642   this is assigned by system or jvm
		// by overridinbg were fivionf ou`r own value
	// o/p 44
	}

}


