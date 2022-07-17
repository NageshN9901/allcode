//1 hetro genuois arraylist means  we can store diffrent datattypes and diffrents data type objects
public class StudentHetrgenuoiss {
String name;
int age ;
  //constructer
public StudentHetrgenuoiss(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
// to string methos
@Override
public String toString() {
	return name+" "+age;
}

}
