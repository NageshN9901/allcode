  //for jdk 1.4
public class WrapperclassTest13 {
public static void main(String[] args) {
	
	byte b=10;       Byte wb=new Byte(b);
	short s=100;          Short ws=new  Short(s);
	int i=1000;                    Integer wio=new Integer(i);
	long l=10000000000000l;       Long wl=new Long(l);
	float f=10.0f;               Float wf=new  Float (f);
	double d=100.0;      Double wd=new Double(d);
 boolean x=true;           Boolean wx=new Boolean (x); 
 char u='c';              Character wc=new Character(u);
 
 
 
 
 
 
 Object z[]= {wb,ws,wio,wl,wf,wd,wx,wc};
 for (int j=0;j<z.length;j++)
 {
	 
	 System.out.println(z[j]);
 }
	
}
}
