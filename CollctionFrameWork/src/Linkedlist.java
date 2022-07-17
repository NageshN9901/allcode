import java.awt.List;
import java.util.LinkedList;
// linked list is subclass of list it is clASS we can create object
public class Linkedlist {
public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();// linkedlist doesnyt has index base
	//LinkedList<String> l=new LinkedList<String>(); its same also a
	l.add("indi");//1
	l.add("bndi");//2
	l.add("cndi");//3
	l.add("dndi");//4
	l.add("ssfndi");//5
	System.out.println(l);//[indi, bndi, cndi, dndi, ssfndi]
	// * *//l.add(9,"baba");// dont  use above limit of 5 becuse IndexOutOfBoundsException
	l.add(2,"baba");
	System.out.println(l);//[indi, bndi, baba, cndi, dndi, ssfndi]
	System.out.println(l.get(0));
	for(int i=0; i<l.size(); i++)
{
	System.out.println(l.get(i));
	
}
}
}
