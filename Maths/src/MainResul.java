import java.util.Scanner;
public class MainResul {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter pyscis marks");
		double a=sc.nextDouble();
		System.out.println("enter englkish marks");
		double b=sc.nextDouble();
		System.out.println("enter maths marks");
		double c=sc.nextDouble();
		System.out.println("enter boilogy marks");
		double d=sc.nextDouble();
		double total=a+b+c+d;
		double avg=total/400*(100);
		if(a<35||b<35||c<35||d<35)
			System.out.println("fail");
		
		if(a>100)
			System.out.println(a+"not valid ");
		else if(b>100)
			System.out.println(b+"not valid ");
		else if(c>100)
			System.out.println(c+"not valid ");
		else if(d>100)
			System.out.println(d+"not valid ");
		
		else if(a>100||b>100||c>100||d>100)
			 
				System.out.println("not vaalid" +avg+ "  %   is not valalid marks ");
		 else if(avg>=85&&avg<100)
			System.out.println("this disticntionm "+avg+"%");
		else if(avg>=60&&avg<100)
			System.out.println("this first class"+avg+"%");
		else if(avg>=50&&avg<100)
			System.out.println("this seconf "+avg+"%");
		else if(avg>=35&&avg<100)
			System.out.println("this pass"+avg+"%");
		else if(avg<35&&avg<100)
			System.out.println("better luck next time failed"+avg+"%");
		else if(a<100&&b<100&&c<100&&d<100)

			System.out.println("not vaalid" +avg);
	
	}

	
	}
	
	
	



