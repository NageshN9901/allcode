
public class Son {
public void display(Son s) //non primtive as parameter
{
	System.out.println("son");
}




public static void main(String[] args) {
	Son s1=new Son();
	s1.display(null);//  thorgh defalut value
	s1.display(s1);//  thorgh reffernce
	s1.display(new Son());// thorgh  object refrenace
}
}
