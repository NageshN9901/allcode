
public class NonprimativearrayPer {

	public static void main(String[] args) {

//using synatx 1
		double a[]=new double[4];
		a[0]=34.44;
		a[1]=98.6;	
		a[2]=345.6	;
		a[3]=544.8;

for (int i=0; i<4; i++)   // forward loop if we have ++
{
	System.out.println(a[i]); 
}
//o/p
//34.44
//98.6
//345.6
//544.8
System.out.println(); // for space
for (int i=3;i>=0;i--)  //backward direction looping --
{
	System.out.println(a[i]); 
}			
//o/p				
//544.8
//345.6
//98.6
//34.44
//		
				
				
				
				
	}

}
