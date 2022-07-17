import java.util.Scanner;
public class MethodCircle {
	static void circleInfo(double raduis)  //method overloading// wr are makimng becacuse no need object
	{
		
		
		System.out.println("raduis"+raduis);
		System.out.println("Area"+3.143*raduis*raduis);
		System.out.println("curcumfernce"+2*3.143*raduis);
	}
public static void main(String[] args) {
	System.out.println("main method starterde");
	//here givinf inpuitby suer screen 2 times and 1 time from keyboard so we use method OverloDIMNG

	circleInfo(5.6); //method overloading////calling method or sattemnt // directv pass value with datatype
	System.out.println();// for space
	double r=6.7;// intilztion
	circleInfo(r); //method overloading//// pasing intilzed varible
	System.out.println();// for spacee
	Scanner sc=new Scanner(System.in);
	double rad=sc.nextDouble();
	circleInfo(rad); //method overloading//
	
}
}
