import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serleztion2part {
	public static void main(String[] args) throws IOException  {
		
		
		
		System.out.println("s");
		Serialztion s=new Serialztion();// object creation
		s.id=10; s.name="nagesh"; s.per=77;// intalizting
		// output operetion and byte oprtion
		
		
		// sending states and classs information inside wrieting 
		
		FileOutputStream fos=new FileOutputStream("nagesh.txt"); // connection
		ObjectOutputStream oops=new ObjectOutputStream(fos);// chainstream connectvity becuase it cionnedct direct
		oops.writeObject(s);
		System.out.println("datat saved succfully");
		
		System.out.println("e");
		
		
//	try {
//		
//		FileOutputStream fos=new FileOutputStream("nagesh.txt"); // connection
//		ObjectOutputStream oops=new ObjectOutputStream(fos);// chainstream connectvity becuase it cionnedct direct
//		oops.writeObject(s);
//	}
//	catch(IOException op)
//		{
//		
//	}
//		finally {
//			oops.close();
//			fos.close();
//	
//		}
	
	}

//	/s
	//tat saved succfully
	//e

}
