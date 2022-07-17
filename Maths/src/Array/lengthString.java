package Array;
// store names in array and display which string has hioghest length
import java.util.Scanner; 
public class lengthString {
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enetr  Integer");
			int n=sc.nextInt();// read // how amny names so int only
			System.out.println("enetr  "+n+"Integer"); 
			
			String names[]=new String [n];// stroing in double array// memory allaction
		System.out.println("entrd  values accaess one by one stiore it in array below");
		
		
		
		for(int i=0;i<names.length; i++)
		{
			
			
			names[i]=sc.next();// becuse we need store string so nuse string reletd method
			// stored in array
		}
		
		System.out.println("show me array whatare names taken input in ararys");
		
		for(int i=0; i<names.length; i++)
		{
			
			System.out.println(names[i]+" ");// printing the names inside arrays
		}
		
		String hname =names[0];// any one  index take// abc
		for(int i=1; i<names.length;i++)
		{
			//if(hname.length()>names[i].length())
			if(names[i].length()>hname.length())// if we want lesser > )     (++ names cganging and comparinge
			/// 0 = abs   1 = abcd 2 = abcde 3 = abcdef  4 = ab
				//abs<  abcd abcde abcdef ab
				//3< 4, 5,6,2
				hname=names[i];
			// abc = abcdef
			//  3<4 =4
		//hname=4 after biger 5 after 6 after 2 no so finalyy 6 is gretre length storte it in hname
			}
			System.out.println("heghst length string is "+hname);
			
		}
	}
	


