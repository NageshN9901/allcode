import java .util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
class sortingBtlambda 
{
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(50);
	l.add(60);
	l.add(70);
	l.add(80);
System.out.println("befoere sorting "+l);//[10, 20, 30, 40, 50, 60, 70, 80]      

Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);//afeter sortojgn[80, 70, 60, 50, 40, 30, 20, 10]
System.out.println("afeter sortojgn"+l);
Collections.sort(l,(I1,I2)->(I1<I2)?-1:(I1<I2)?1:0);//afeter sortojgn[80, 70, 60, 50, 40, 30, 20, 10]
System.out.println("afeter sortojgn"+l);

//
Collections.sort(l);   // sorting inbuilkt method
for (int i=0; i<l.size();i++)
{
	
	System.out.println(l.get(i));
	
}
}


}
