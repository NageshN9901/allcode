//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;// will not accept null
//mport java.util.LinkedHashSet;

//Set>>>>> fALLOWWS lINKEDsET Hsahset treeset
public class SetC {

	
	public static void main(String[] args) {
		//Set<String >set=new HashSet<>(); // childs of set
		//Set<String >set=new LinkedHashSet<>(); // childs of set
		Set<String >s=new  HashSet<>(); // childs of set
	s.add("papapya");
	s.add("orenage");
	s.add("papapya");// duplication value not accept
	s.add(null);
	s.add(null);
	s.add("mangoo");
			 
	
	s.add(null);// duplication value not accept
	s.add("watermelon");
	s.add("jamun");
	System.out.println(s);
	
//Object x[]=s.toArray();
//for(int i=x.length-1; i>=0; i--)
//{
//	System.out.println(x[i]);
//	
//}
//}
//	Iterator<String>i=s.iterator();// we cant creat object for  Iterator becuse its inetrface so use same below
//	while(i.hasNext())
//	{
//		// here hasNext is inbulit method which checks next object or elment is thre or not so its acts like contion
//		//like i<=5 just
//		// and Next method will take iteration process it will contune untill hasNext method get FALSE 
//		Object s1=i.next();
//		System.out.println(s1);
//	}
//	}
	s.forEach(System.out::println);
	
	

	}
}
// one thing this set will desnt as index or any pattern so it eill gieev o/p diffreemt
//o/p [papapya, orenage, null, mangoo, watermelon, jamun]