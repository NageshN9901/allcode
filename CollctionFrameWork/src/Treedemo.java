//import java.util.*;
import java.util.Collections;
import java.util.TreeSet;

public class Treedemo {
	public static void main(String[] args) {
		

	TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
	ts.add("apaya");
	ts.add("mango");
	ts.add("oragnge");
	ts.add("mango");
	ts.add("apple");
	ts.add("water melon");
//System.out.print(ts);
	System.out.println(ts);//[water melon, papaya, oragnge, mango, apple]
// this BOVE REVSRSE ORDER
	//[water melon, papaya, oragnge, mango, apple]
	TreeSet<String> ds=new TreeSet<String>();
	ds.add("apaya");
	ds.add("mango");
	ds.add("oragnge");// ascending Order
	ds.add("mango");
	ds.add("apple");
	ds.add("water melon");
//System.out.print(ts);
	System.out.println(ds);//[w
	
	}

//	
//	TreeSet<String> tI=new TreeSet<String>();
//	public static void main(String[] args) {
//		
//
//		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
//		ts.add("papaya");
//		ts.add("mango");
//		ts.add("oragnge");
//		ts.add("mango");
//		ts.add("apple");
//		ts.add("water melon");
//		// by defalut treeset is acscending order
//		System.out.println(ts);//[water melon, papaya, oragnge, mango, apple]
//
//}

}
	

