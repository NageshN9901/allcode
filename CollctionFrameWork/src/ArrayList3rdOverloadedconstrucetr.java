import java.util.*;
public class ArrayList3rdOverloadedconstrucetr {
public static void main(String[] args) {
	LinkedHashSet<String>l=new LinkedHashSet<String>();
	l.add(null);
	l.add(null);
	l.add("red");
	l.add("rd");
	l.add("s");
	l.add("e");
	l.add("a");
	l.add("z");
	l.add("z");
	l.add(null);
	l.add(null);
	System.out.println(l);//[red, rd, s, e, a, z]

	//System.out.println(a.get(0));//red
	// we need overload constructer of arraylist
	ArrayList<String>a=new ArrayList<String>(l);
	System.out.println(a);//[red, rd, s, e, a, z]
	a.add("hjh");
	System.out.println(a.get(0));//red
	a.add(1,"ksjk");
	System.out.println(a);//[red, ksjk, rd, s, e, a, z]
	ArrayList<String>ar=new ArrayList<String>(a);
	
	ar.add(null);
	ar.add(null);
	ar.add("z");
	ar.add("z");
a.addAll(2,a);
System.out.println(ar);//[red, ksjk, rd, s, e, a, z, hjh]
for(int i=0; i<a.size(); i++)
{
	System.out.println(l.get(i));
	
}
}
}
