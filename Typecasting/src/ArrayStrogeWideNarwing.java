
public class ArrayStrogeWideNarwing {
public static void main(String[] args) {

	
	
	
	byte b1=10;
	byte b2=20;
	short s1=100;
	int i1=1000;
	long l1=100l;
	//int x[]= {b1,b2,s1,i1};//data widing 
//arrowingg we cant convert big to small by small so need data narrowing
int z[]= {b1,b2,s1,i1,(int)l1}; //so use data Norrow
//	for (int i=0; i<=x.length-1; i++)
//	{
//		
//		System.out.println(x[i]);
//	}
	for (int i=0; i<=z.length-1; i++)
	{
		
		System.out.println(z[i]);
	}
}
// casting toint 
//10
//20
//100
//1000
//10
//20
//100
//1000
//100


			
	
}
//just Example 