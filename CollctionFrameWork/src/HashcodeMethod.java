
public class HashcodeMethod {
	
	int d;
	int salary;
	String name;
	public static void main(String[] args) {
		HashcodeMethod v=new HashcodeMethod();
		v.d=44;   v.name="nag";   v.salary=77778787;// varible intliztion through object reffrence
		///System.out.println(v.d);  how to accsesss the avrible throigh reffereenece Object
		System.out.println(v);//HashcodeMethod@15db9742
		System.out.println(v.hashCode());// asssigninf by system r jvm to obejct throuhg overriding we can give our own
	
	
	//HashcodeMethod@15db9742
//		/366712642
	
	}
	
	

}
