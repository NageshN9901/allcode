import java.util.Scanner;
// speacail number maesn 5+9+5*9=59
public class MethodSpecial {
static boolean isSpecial(int x)
{//1s
	int d1=x/10;// it will take quitesnt//52// it will take 5
			int d2=x%10;// it will give reinder// it will take first 2
			int sum=d1+d2+d1*d2;// this is formula for spical number
if(sum==x)
	
	return true;
else 
	return false;}//2e

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the number");
	int n=sc.nextInt();
   //  returndatatype ref=callingmethod with sacnner cals  varible
	boolean aa=isSpecial(n);// n=x
	if(aa==true)// sum==x
		System.out.println(n+"yes");
		
		else
			
			System.out.println(n+"noo");
}

}


