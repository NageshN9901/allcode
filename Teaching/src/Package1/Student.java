package Package1;

public class Student {
 public String name;
	
	public void Study()
	{
		
		System.out.println("study mathod");
	}
	
	
	public static void main(String[] args) {
		Student s1=new  Student ();
		s1.name="rahul";
		System.out.println(s1.name);
		
		s1.Study();
	}
}
