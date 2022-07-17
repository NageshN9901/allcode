import java.util.Stack;

public class StackLoop {


	public static void main(String[] args) {
		
	
	Stack<Integer> sr=new Stack<>();
	{
		for (int i=0; i<5; i++)
		{
			sr.push(i);
		}
	 System.out.println(sr.search(2));
	 System.out.println(sr);
	}
	}
}

