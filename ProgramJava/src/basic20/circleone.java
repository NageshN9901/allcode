package basic20;
// read the cicrle raduis print area and permeter
import java.util.Scanner;
public class circleone {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the radis");
	double r=sc.nextInt();
	System.out.println("area"+" "+3.14*(r*r));
	System.out.println("curcumfernce"+" "+2*3.14*r);
	System.out.println("area"+" "+Math.PI*(r*r));
	System.out.println("curcumfernce"+" "+2*Math.PI*r);
}
}
