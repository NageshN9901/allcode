
import java.util.Scanner;

public class CircleDetils {

	
	
	
	
	
	
	public static void main(String[] args) {
		//System.out.println(Math.PI);
		
Scanner sc=new Scanner(System.in);// this is scanner object and sysytem,in is reader so we can give input
		System.out.println(" Enter the radius");
		double  raduis;  ///data type
		 raduis =sc.nextDouble(); // input method
	//	double area =Math.PI*(raduis*raduis);//intialzing
		//raduis formula pi*r^2
		//in the place of Math.PI we can wrtite 3.141592653589793
	//	double raduis=2; this is how to make constant
		//double circumfernce=2*Math.PI*raduis; //intialzing
		//circumfernce formula 2pir
		System.out.println("area= "+Math.PI*(raduis*raduis));
		System.out.println("circumfernce (or ) perimetr"+ 2*Math.PI*raduis);
		//System.out.println(sc.next());   to enter the Stering value
	}
}
