

public class Student {

	String name;
	 static String course="i8879dff";
	int Eid =34444;
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="nagesh";  s1.course="dev";
		Student s2=new Student();
		s2.name="mahesh";   s1.course="enenev";
		Student s3=new Student();
		s3.name="easesh";          s1.course="gg"; 
		s1.Eid=988;//
//		nagesh  01909ev 12323
//		mahesh  01909ev 12323
//		ramesh  01909ev 12323

		// chnage it will change for all objects
		
		System.out.println(s1.name+"  "+s1.course+" "+s1.Eid);
		System.out.println(s2.name+"  "+s2.course+" "+s2.Eid);
		System.out.println(s3.name+"  "+s1.course+" "+s3.Eid);
	}
	
}
 // if we are not intialze later it wil take last values