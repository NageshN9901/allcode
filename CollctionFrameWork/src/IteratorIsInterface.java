import java.util.*;

public class IteratorIsInterface {
public static void main(String[] args) throws  NoSuchElementException// IT JUST USIG
{
	LinkedList<String>l=new LinkedList();
	l.add("indi");//1
	l.add("bndi");//2
	l.add("cndi");//3
	l.add("dndi");//4
	l.add("ssfndi");//5
	l.add("ssfndi");//5
	l.add(null);//5
	l.add(null);//5
	Iterator<String>i=l.iterator();// we cant creat object for  Iterator becuse its inetrface so use same below
	while(i.hasNext())
	{
		// here hasNext is inbulit method which checks next object or elment is thre or not so its acts like contion
		//like i<=5 just
		// and Next method will take iteration process it will contune untill hasNext method get FALSE 
		String a=i.next();
		System.out.println(a);
	}
//	String e1=i.next();
//	System.out.println(e1);////indi
//// interface        = inbulitmethod
//String a1=i.next();// adding to the linkedlist objects to Iterator 
//
//System.out.println(a1);
//String a2=i.next();// adding to the linkedlist objects to Iterator 
//
//System.out.println(a2);
//String a3=i.next();// adding to the linkedlist objects to Iterator 
//
//System.out.println(a3);
//String a4=i.next();// adding to the linkedlist objects to Iterator 
//
//System.out.println(a4);
//String a5=i.next();// adding to the linkedlist objects to Iterator 
//
//System.out.println(a5);
//
//
//
////String a6=i.next();// there is no 6 but wr adding NoSuchElementException
//
////System.out.println(a5);	
//try {// this is not need but jstw2w
//	
//}
//
//catch(NoSuchElementException j)
//{
//	String a6=i.next();// there is no 6 but wr adding NoSuchElementException
//
//	System.out.println(a6);	
//	
//}
//
//
//
//
////this is lenght process so use while loop usimg hasnext methof to check
////next data is there untill data present it will move next after complting 5 it will termenited

}






}