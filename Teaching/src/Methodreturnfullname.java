
public class Methodreturnfullname {
	
	
	
//	String firstname(String f)
//	{
//		return f;	
//	}
//	String lastname(String l)
//	{
//		
//	  return l;	
//	}
//	
	String firstname(String first)
	{
		return first;	
	}
	String lastname(String last)
	{
		
	  return last;	
	}
	
	void fullname(String a,String b)
	
	{
		System.out.println("my full name is");
		System.out.println(a +" "+b);

				
	}

	public static void main(String[] args) {	
	Methodreturnfullname s=new Methodreturnfullname();
	String x=s.firstname("Nagesh");
	String y=s.lastname("N");
	s.fullname(x,y);

//	String x=s.firstname("nagesh");
//	String w=s.lastname("n");
//	s.na(x+w);
	
	}

}
//o/p
//my full name is
//Nagesh N