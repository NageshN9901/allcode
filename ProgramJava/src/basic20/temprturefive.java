package basic20;

// read the temp in celcus and fehernet
import java.util.Scanner;

public class temprturefive {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the temp in celcues");
		double celuscs=sc.nextInt();
		System.out.println("temopp in fehrnite"+" "+(9*(celuscs)+(32*5))/5);
		//for fehrnte to celsus
		System.out.println("fernet to ceslus "+""+(5*(celuscs-32))/9);
	}
		
}
