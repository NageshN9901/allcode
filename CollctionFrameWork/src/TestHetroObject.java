import  java.util.*;
public class TestHetroObject {
public static void main(String[] args) {
	StudentHetrgenuoiss s1=new StudentHetrgenuoiss("viajay",3477637);
	StudentHetrgenuoiss s2=new StudentHetrgenuoiss("tiajay",355477637);
	
	CarHetro c1=new CarHetro("tewytewt",21761766);
	CarHetro c2=new CarHetro("fegfge",121761766);
	
ArrayList<Object>al=new ArrayList<Object>();// hwtro genous arrya becuse object is genricss




al.add(s1); al.add(s2); al.add(c1); al.add(c2);// adding the objects to arrlist by inbuiltmethod add
//  index 0             //1             2            3
// but acutal size or length takes not falloes index it will srtart from 1  al.size-1
//al.addAll(al);
//for (int i=al.size()-1;i>=0; i--) {// backward direction
	//System.out.println(al.get(i));
	
	
	
	
	//onthre way of print detils using Instanceoff
	for (int i=al.size()-1; i>=0; i--)
	{
		//arraylist reff with getmethgod
	if(al.get(i) instanceof  StudentHetrgenuoiss)
	{
		Object o1=al.get(i);//upcasting  object is parent  and al.get(i) child strig 4 object 
		StudentHetrgenuoiss s=(StudentHetrgenuoiss)o1;
		//Object o2=al.get(i);// dont use class cast exception 1// we  cant use ts used instanceof student
		//CarHetro c=(CarHetro)o2;// dont use class cast exception 2
		System.out.println(s.name+" "+s.age);
		//System.out.println(c.brand+" "+c.price);// dont use class cast exception 3
	}// inthis method we will get only students detils  becuse dawancasting done for only student
	
	
	// how thios is going work means it will chwck al.get(i) has 4 object instnce student 2objcets this if as 2 objectys 
	// it will comwe out elase will part will take 2 objects
	else
	{
		Object o2=al.get(i);
		CarHetro c=(CarHetro)o2;
		System.out.println(c.brand+" "+c.price);
		
	}
}
}
}

