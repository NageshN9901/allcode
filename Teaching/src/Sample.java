import java.util.*;
public class Sample {
	
	int display(int a,int b)
	{
		return ((a^2)+(b^5));
	
		
	}

	
	
	
	public static void main(String[] args) {
		Sample  s=new Sample ();
		int x=s.display(2,5);
		System.out.println(x);
	}
}
s