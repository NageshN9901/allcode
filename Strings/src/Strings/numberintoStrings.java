package Strings;
import java.util.Scanner;
public class numberintoStrings {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enetr the number");
	int n=sc.nextInt();//75345678
	nw(n/10000000,"crore");// 1 corere
	nw(n/100000%100,"lakh");//
	nw(n/1000%100,"thousand");
	nw(n/100%10,"handerde");

	nw(n%100,"");
//	
//	System.out.println(75345678/10000000);//7  crre
//System.out.println(75345678/100000);//753// 1
//System.out.println(75345678/100000%100);//53// final 2   53 laksh
//System.out.println(75345678/1000);//75345  
//System.out.println(75345678/1000%100); //45  45 thousand
//System.out.println(75345678/100);//753456
//System.out.println(75345678/100%10);//6
	//System.out.println(75345678%10);// 8
 ////	System.out.println(75345678/10);// 8
}



static void nw (int x,String st)
{
	
	if(x==0)
		return;
	
	String one[]= {"","one","two","Three","four","five","six","seven","eight","nine","ten","elven","twelve","Thirteen","fourteen","fifteen","sixteen",
		"seventeen","eighteen","ninteen"};
	String two[]= {"twenty","thirty","fourty","fifity","sexty","seventy","eighty","ninty"};
	if(x<20)
		System.out.print(one[x]+" ");//75345678
	else
		System.out.print(two[x/10]+" "+one[x%10]+" ");
	System.out.print(st+"");
 }

}
