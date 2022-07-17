
public class Fatherr {
public void display(Fatherr s)
{
	System.out.println("son");
}
public static void main(String[] args) {
	Fatherr s1=new Fatherr();
	s1.display(null);//defalut value
	s1.display(s1);//reffrnce
	s1.display(new Fatherr());//oject reffrnce
	
}
}
