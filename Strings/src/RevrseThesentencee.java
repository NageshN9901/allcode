import java.util.Scanner;

public class RevrseThesentencee {
	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("enetr the string in sentence");
		
	String w=sc.nextLine();// what ever enterd in the scanner it willls tore in this wa

	 String s =revsen(w);
	 System.out.println(s);
		
		
	}

	public static String revsen(String js) {
		
		int x=js.indexOf(" ");
		if(x==-1)
			return js;// searching backward from the specified index,
	    // *          or {@code -1} if there is no such occurrence.
		return revsen(js.substring(x+1))+ " "+js.substring(0,x );
	}
//for(int i=js.length(); i>=0; i--)
//{
//	
//	
//}
	
	}
