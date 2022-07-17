import java.util.*;

public class Vectordemo {
public static void main(String[] args) {
	Vector v=new Vector ();
	v.add("v1");
	v.add("v2");
	v.add("v1");
	v.add(null);
	v.add(null);
	v.add(null);
//Collections.reverse(v);//[null, null, null, v1, v2, v1] //// works
	System.out.println(v);//[v1, v2, v1, null, null, null] n numbver of null it cvsn accepts
	v.remove(1);
	System.out.println(v);//[v1, v1, null, null, null] it supports shift opertion
	
	//Collections.reverse(v);
//	Enumeration e=v.elements();
//	while(e.hasMoreElements())
//		System.out.println(e.nextElement());  // works
//}


//v1
//v2
//v1
//null
//null
//null

}
}