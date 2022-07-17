
public class NonstaticStudent {



	String name;
	 String course;
//	int Eid =12323;
	 
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="maheshs";  s1.course="dev";
		Student s2=new Student();
		s2.name="nagesh"; s2.course="dev";
		Student s3=new Student();
		s3.name="ramesh"; s3.course="dev";
		s3.course="rtrt";
		s2.name="fagf";
		 
		
		System.out.println(s1.name+"  "+s1.course);
		System.out.println(s2.name+"  "+s2.course);
		System.out.println(s3.name+"  "+s3.course);
	}
	
}


