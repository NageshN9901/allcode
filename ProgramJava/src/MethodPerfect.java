

import java.util.*;
public class MethodPerfect {

	static boolean isPerfect(int  n)
	{
		int sum=0;
		for(int i=1; i<n; i++)
		{
			if( n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n )
			
		{
			//System.out.println("true");
			return true;
		}
		else
		{
			//System.out.println("false");
			return false;
		}
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enterr any number");
	int n=sc.nextInt();
	boolean rs  =isPerfect(n);
	if (rs==true)
	{
		System.out.println("its perfect number"+rs);
		
	}
	else
	{
		System.out.println("not perfect number"+" " +rs);
	}
	//System.out.println(6%6);
}

	

	
}
