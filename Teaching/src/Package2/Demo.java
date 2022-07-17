package Package2;
import Package1.Student;
public class Demo  extends  Student{

//	  it is foir protected access modifaier
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.name="rahul";
		System.out.println(s1.name);
		s1.Study();
	}
}
