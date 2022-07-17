
public class BikeCloneableMarkableInterface  implements Cloneable{
String name;
int price;
public static void main(String[] args) throws CloneNotSupportedException 
{
	BikeCloneableMarkableInterface b1=new BikeCloneableMarkableInterface();
	b1.name="honda";
	b1.price=23333;
			System.out.println("orginal "+" "+b1.name+b1.price);//orginal  honda23333
			Object x=b1.clone();// if write this one incatimg will take like that only//clone is method
			BikeCloneableMarkableInterface z=(BikeCloneableMarkableInterface)x;
		//	BikeCloneableMarkableInterface z=(BikeCloneableMarkableInterface) b1.clone();//1
			//we can use 1 also same rsult
			// if write this one incatimg will take like that only//clone is method
			System.out.println("cloned "+" "+z.name+z.price);
}
}
//rginal  honda23333
//cloned  honda23333
