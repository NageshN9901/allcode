
public class ArrayDemo {

	public static void main(String[] args) {
		String Superheros[]= {"thor","batman","superman","spiderman","Nagesh"};

		
		System.out.println(Superheros.length);// o/p = 5// length is used find the length of data
		System.out.println("last index; "+" "+(Superheros.length-1));//o/p =4
		
		
		
		
		System.out.println("forward dierection");
		for (int i=0;i<Superheros.length;i++)
		{
			System.out.println(Superheros[i]);//thor
			//batman
			//superman
			////spiderman
			//Nagesh

		}
		
		
		System.out.println("backwasrd dierection");
		for (int  i=Superheros.length-1;i>=0;i--)
		{
		
		System.out.println(Superheros[i]);
		}
		
	}
		
}


//o/p
//5
//last index;  4
//thor
//batman
//superman
//spiderman
//Nagesh