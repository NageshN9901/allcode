//public class Fa implements Is,Ir{
public class Fa implements Hybrid{
public void insp()
{
	
	System.out.println("increse spped");
}
public void desp()
{	
	
	System.out.println("decrese speeds");
}





public void swon() 
{
	
	System.out.println("switch on");
}
public void swof() 
{
	
	System.out.println("wtich off");
}
@Override
public void gg() {

System.out.println("jhj");
}
	
public static void main(String[] args) {
	//Fa f=new Fa();
	  Hybrid h=new Fa();
	
	h.insp();
     h.swon();
     h.swof();
	h.desp();
	h.gg();
}

}


