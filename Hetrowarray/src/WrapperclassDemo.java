
public class WrapperclassDemo {
// jdk 1.8
	
	
	
	
	public static void main(String[] args) {
		
		
		byte b=10;
		short s=100;
		int i=1000;
		long l=10000000000000l;
		float f=10.0f;
		double d=100.0;
	 boolean x=true;
	 char u='c';
	 //auto conversion from primetive data to non primative data 
	 Object z[]= {b,s,i,l,f,d,x}; 
	// Object z[]= {b,s,i,l,f,d,x,100,"nagesh"};// Object is the accaeptle word coneversion used
	 for(int j=0;j<z.length;j++)
	 {
		System.out.println(z[j]);
	 }
	 
		
		
	}
}
//o/p
//10
//100
//1000
//100000000007t5000000
//10.0
//100.0
//true