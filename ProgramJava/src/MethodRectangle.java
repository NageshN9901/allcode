
	import java.util.Scanner;

public class MethodRectangle {
	static void Detils(double l,double b)
	{
		
		
	System.out.println("length "+"  "+ l +" 	"+" "+"bredth "+" "+b);
	System.out.println("area"+l*b);
	System.out.println("permeter"+2*(l*b));
	}

	public static void main(String[] args) {
		System.out.println("st");
		Detils(5.7,5.5);
		double r=7.7,b=9.0;
		Detils(r,b);
		System.out.println();
		Scanner sc=new Scanner(System.in);
		//double num=sc.nextInt();  // dont no thid mistyake for double datatype input method is Int ivein
		double length=sc.nextDouble();
		double bredth=sc.nextDouble();
		Detils(length ,bredth);
				
	}
}
