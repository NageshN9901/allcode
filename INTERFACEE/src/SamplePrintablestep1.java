
interface SamplePrintablestep1 {

	void print();
}


interface Showable{
	void show();
}
class Epson implements SamplePrintablestep1,Showable{
	@Override
 public void print() {
	 
	 
	 System.out.println("hpo printe spson s23");
 }

@Override
public void show() {
System.out.println("hi iam a4 a5");
}
}

//why its not working 											 
//class Min{
	
// we cant write main metghod ibnside uinterface


