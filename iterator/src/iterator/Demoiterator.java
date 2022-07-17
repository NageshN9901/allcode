
package iterator;
import java.util.*;

public class Demoiterator { 
	public static void main (String[] args) {
		LinkedList l= new LinkedList ();
		
	l.add("add");
	l.add(2);
	l.add(3);
	l.add(9);
	System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			 Object u=itr.next();
			System.out.println(itr.next());
			//System.out.println(u);
		}
		
	}

}
