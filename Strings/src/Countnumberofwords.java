import java.util.Scanner;
public class Countnumberofwords {
public static void main(String[] args) {
	
	Scanner sc=new  Scanner(System.in);
	System.out.println("enetr the string in sentence");
	
String w=sc.nextLine();// what ever enterd in the scanner it willls tore in this wa

 int count =countnumberofword(w);
 System.out.println(count);
	
	
}

public static int countnumberofword(String j) {
	int count=0;
	if(j.charAt(0)!= ' ') {// index fisrt should not be space then only irt will count
		count++;
		
	}
	for(int i=0; i<j.length();i++) {
		if(j.charAt(i)==' '&& j.charAt(i+1)!=' ' ) 
			
			count++;
		

	}
	return count;
}
	
	
	
}
