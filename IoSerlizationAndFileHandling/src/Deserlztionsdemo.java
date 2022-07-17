import java .io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserlztionsdemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	

	FileInputStream fis=new FileInputStream("nagesh.txt");
	
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object o=ois.readObject();
	Serialztion s=(Serialztion)o;
	System.out.println(s.id+" "+s.name+" "+s.per);
	ois.close(); fis.close();
	
}
}
//o/p 10 nagesh 77.0  it reading by file 