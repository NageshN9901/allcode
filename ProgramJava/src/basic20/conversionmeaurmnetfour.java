package basic20;

// read the stick in cm convert into m and feet
import java.util.Scanner;

public class conversionmeaurmnetfour {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radis");
		double cm=sc.nextInt();
		
		System.out.println("eneter the length in cm");
		double feet=0.0325*cm;// conversion to cm to feet
		double m=0.01*cm;// conversion from   cm to m
		System.out.println("cm to feet"+" "+feet);// one way
		System.out.println("cm to feet"+" "+0.0325*cm);// second way
		System.out.println("cm to feet"+" "+m);
		System.out.println("cm to feet"+" "+0.01*cm);
	}
	}
