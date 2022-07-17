
public class tostring {
String name;
int age;
@Override
public String toString() {
	
return this.name+" "+this.age;

}

public static void main(String[] args) {
	tostring h=new tostring();
	
	h.name="nncn";
	h.age=23;
	System.out.println(h.toString());
	System.out.println(h);
}



}


