import java.util.Scanner;

public class CircleDetils {

	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the radius");
		double raduis =sc.nextDouble();

//  we can give   double raduis;
		double area =Math.PI*(raduis*raduis);
		
		double circumfernce=Math.PI*2*raduis;
		System.out.println("area= "+area);
		System.out.println("circumfernce "+ circumfernce);
	}
}
