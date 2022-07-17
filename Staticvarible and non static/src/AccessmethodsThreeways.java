
public class AccessmethodsThreeways {

	
	
	static String course ="dev";
	public static void main(String[] args) {
		
		
		System.out.println(course); // dierectly   variblename
		
		System.out.println(AccessmethodsThreeways.course);  //class name.variblename
		
		
		AccessmethodsThreeways s=new AccessmethodsThreeways();
 
		System.out.println(s.course);  //by creating object reffrnce
	}
}
