
public class DataWideing {
	
	
public static void main(String[] args) {
	byte b1=10;
	byte x=b1;
	System.out.println(b1 +" "+x);  //data wideing //10 10//  LH>RHS
	
	
	int i=x;
	System.out.println(i+" "+x);//data wideing//10 10
	
	long l=i;
	System.out.println(l+" "+i);//data wideing//10 10
	
	int y=0;
	
	byte z=(byte)y;//data Narrowing
	
	
	System.out.println(y+" "+z); //0 0
}





}
