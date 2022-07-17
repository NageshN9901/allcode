import java.util.*;
public class MesurmentConversion {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	double cm,feet,meters;
	
	System.out.println("enter the length in centimeter");
	cm=sc.nextDouble();
	feet =0.0328*cm;
	meters=0.01*cm;
	System.out.println("this cm to feet coversion"+ " " +feet);
	System.out.println("this cm to meter coversion"+ " " +meters);
}


}

