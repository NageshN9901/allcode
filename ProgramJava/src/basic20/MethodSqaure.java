import java.util.Scanner;
public class MethodSqaure {
static void Detils(double a)
{
	
	
System.out.println("enter ="+a);
System.out.println("area="+a*a);
System.out.println("permeter="+4*a);
}

public static void main(String[] args) {
	System.out.println("st");
	Detils(5.7);
	double r=7.7;
	Detils(r);
	System.out.println();
	Scanner sc=new Scanner(System.in);
	//double num=sc.nextInt();  // dont no thid mistyake
	double num=sc.nextDouble();
	Detils(num);
			
}
}
