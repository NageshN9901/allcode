
//2/ homegnous arrylist exmple below    omagenous means same type
import java .util.*;
public class TestForArraylistStore {
public static void main(String[] args) {
	ArraylistStoreSameObjectEmplyee a1=new ArraylistStoreSameObjectEmplyee("ahul",14444);
	ArraylistStoreSameObjectEmplyee a2=new ArraylistStoreSameObjectEmplyee("bahukl",2224444);
	ArraylistStoreSameObjectEmplyee a3=new ArraylistStoreSameObjectEmplyee("cahul",3334444);
	ArraylistStoreSameObjectEmplyee a4=new ArraylistStoreSameObjectEmplyee("dabul ",4554444);
	
	
	
	
	// if all same objects means   genrics as object anme
	ArrayList<ArraylistStoreSameObjectEmplyee> al=new ArrayList<ArraylistStoreSameObjectEmplyee>();
	
	al.add(a1);    al.add(a2);    al.add(a3);    al.add(a4);   // adding objects array by using reffrence
	
	System.out.println(al.get(2));  // if we write index as element it will give only address
	 // so need full detils
	
for (int i=0; i<al.size(); i++)
		//for (int i=0; i<=al.size()-1; i++)
	{
		ArraylistStoreSameObjectEmplyee a=al.get(i);
		System.out.println(a.name+" "+a.salary);
	}

}
}
 