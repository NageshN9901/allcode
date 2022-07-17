import java .util.*;
public class ListIterter {
// listItertor is sub Interface of  List iInterfaces so we cant creat object>>..1
	public static void main(String[] args) {
		List<String> p=new ArrayList<String>();//>>..1// parent  stronig the data into arryalist// upcasting
		// PARENT              SON LIKE ARRAYLIST ,LINKEDLIST,STACK.
		//BUT NOT ACCEPT HES HIRRCY
		//List<String> p=new LinkedList<String>();//>>..1// parent  stronig the data into arryalist// upcasting
		//work fine becuse fallows hirrcy//List<String> p=new Vector<String>();//>>..1// parent  stronig the data into arryalist// upcasting
		//List<String> p=new Stack<String>();//>>..1// parent  stronig the data into arryalist// upcasting
		//Set<String> p=new LinkedHashSet<String>(); it will not work for Listinteroer
		//List<String> p=new Vector<String>(); wprks
		//List<String> p=new Stack<String>(); works
		p.add("banglorw");// ADDING INTO ARRYLIST SON OF  LIST
		p.add("manali");// ADDING INTO ARRYLIST SON OF  LIST
		p.add("lahor");// ADDING INTO ARRYLIST SON OF  LIST
		p.add("pune");// ADDING INTO ARRYLIST SON OF  LIST
		p.add(null);
		p.add(null);
		p.add(null);
		p.add("pune");
		System.out.println(p.get(0));// for searching opertions we can use in 
		//System.out.println(p); [banglorw, manali, lahor, pune]

		// so now above data added to 
		// now print forward dierction
		ListIterator<String> fa=p.listIterator();// taking back from parent
		//Iterator<String> fa=p.listIterator(); IT WORKS BECUSE IT IS THE 
		//PARENT                    INBUILTMETHOD OF PARENT E CAN USE FOR lISTIterator
		while(fa.hasNext())// hasnext search next object or next
		{
			String pl=fa.next();// next move to next object or data
			////or
		//Object pl=fa.next(); works
			System.out.println(pl);
		}
		System.out.println("break");
		ListIterator<String> ba=p.listIterator(p.size());// taking back from parent
		while(ba.hasPrevious())//search previous object or next
		{
			String pp=ba.previous();// move to previous
			////or
			//Object pp=fa.prvous(); works
			System.out.println(pp);
		}
		
	}
	

}
