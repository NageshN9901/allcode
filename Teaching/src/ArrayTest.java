
public class ArrayTest {
	public static void main(String[] args) {
		
	
	int array[]=new int[4];//instatntion
	array[0]=10;// i named array is name can give any name
	array[1]=20;
	array[2]=30;
	array[3]=40;
	System.out.println("feting particular data from array");
	int x=array[1];
	System.out.println(x);//or 1
	System.out.println(array[2]);
	System.out.println("fething all data from array");
	System.out.println();
	System.out.println("forward deierction");
	for (int i=0;i<4;i++)/// for looping ////i<array.length
		
	{
		System.out.println(array[i]);
	}
	System.out.println("backward diercetion");
	for (int i=3;i>=0;i--)
	{
		System.out.println(array[i]);
	}

	}
	
}
