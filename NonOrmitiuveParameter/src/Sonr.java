

public class Sonr extends Fatherr {
public void display(Fatherr f )
{
	
	System.out.println("Father1 f");
}
public void display(Sonr s)
{
	
	System.out.println("Son1 s");
}
public static void main(String[] args) {
	

	
	//Fatherr s=new Sonr  ();
	//Sonr g =(Sonr)s;
//d.display(Father ); // it will tAKE SAME PARAMETRE TYPE\
	
	
	Sonr s1=new Sonr();
	s1.display(null);//Son1 s
	s1.display(new Fatherr());//Father1 f
	s1.display(new Sonr());//Son1 s
}

	
}

