public interface SamplePrintablestep1 {

	void print();
}


interface Showable extends SamplePrintablestep1{
	void show();
}
class Epson implements Showable{
	
 public void print() {
	 
	 
	 System.out.println("hpo printe spson s23");
 }

@Override
public void show() {
System.out.println("hi iam a4 a5");
	
}


class test{
public static void main(String[] args) {
	Epson o=new Epson();
	o.print();
	o.show();
}

}
}