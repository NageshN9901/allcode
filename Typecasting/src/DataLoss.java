
public class DataLoss {
public static void main(String[] args) {
	int i=129;
	byte b=(byte)i;  // when doing data narrowing its occures big to small data loss
	System.out.println(i+" "+b);     //129 -127    
// here data loss dueto int as 127 capacity but itd 129 diff is 2 so clock is start at -128 next is -127 thats ways
	
	double d=10.22;
	int x=(int)d;
	System.out.println(d+" "+x);  //10.22 10
	
	//here loss of .22 decmal value due to converting from decaml double to non int
	
	
}
}
