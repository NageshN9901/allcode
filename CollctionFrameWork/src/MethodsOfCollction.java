import java.util.ArrayList;
import java.util.Collection;

public class MethodsOfCollction {


public static void main(String[] args) {
	
	
	
	Collection<String> rcb=new ArrayList<String>();//
	
	rcb.add("kohli");  //using add collction method to add method used to used add specfic element into a set of collction
		rcb.add("maxwell");
			rcb.add("dinsh")	;
			
			Collection<String> mi=new ArrayList<String>();
			mi.add("rohith sharama");
			mi.add("ishan kishan");
			mi.add("boomraha");
			
			Collection <String> kkr =new ArrayList<String>();
			kkr .add("sheryass");
			kkr .add("RUSSEL");
			kkr.add("sunil");
			Collection<String> ipl=new ArrayList<String>();
			ipl.addAll(rcb);// adding all 3 groups one by one into ipl
			ipl.addAll(mi);
			ipl.addAll(kkr);  // here added all into ipl
			//ipl.addAll(rcb); it will reapet
	System.out.println(ipl);  //[kohli, maxwell, dinsh, rohith sharama, ishan kishan, boomraha, sheryass, RUSSEL, sunil] 
			System.out.println(ipl.size());//9
			
			
			//we going to remove one name from kkr reomve method
			ipl.remove("RUSSEL");// russel removed  so remove one data
			System.out.println(ipl);//[kohli, maxwell, dinsh, rohith sharama, ishan kishan, boomraha, sheryass, sunil]
			
		// if data which one we are passing if its there it gives true if not there it gives false
			
			System.out.println(ipl.contains("Dhoni"));//false becuse dhone is not listed are not coded
			System.out.println(ipl.contains("rohith sharama"));//TRUE BECUSE THE HAT DATA IS THEER 
			   // TO KNOW PARCTCUALR OBJECT CONTAINSALL TO KNOW THAT WE USE containsAll method
			System.out.println(ipl.containsAll(rcb));// true yes becuse we have removes russel from kkr not from rcb
			System.out.println(ipl.contains(kkr));// false we reomed russel from kkr he belomg to kkr
			System.out.println(ipl.contains(ipl));//false
			
			
			//to remove one group         removeAll method
			ipl.removeAll(kkr);
			System.out.println(ipl);//[kohli, maxwell, dinsh, rohith sharama, ishan kishan, boomraha]
 //we have reomved remaining  2peples from kkr
			//ipl.removeAll(ipl);
			//System.out.println(ipl);//[] it is pooible to reomve parent coolection only
			
			//to know that parentcoollection empty or not we use isEmpty method
			System.out.println(ipl.isEmpty());//false  becuse not empty becuse still 2 group is there
		
			System.out.println(kkr.isEmpty());//why false
			
			
		ipl.clear();//it will clear thaat collection fully
		System.out.println(ipl.isEmpty());//true clear is going delete the all data in that colletion
		
			
 }
}
