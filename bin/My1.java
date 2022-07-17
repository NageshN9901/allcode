interface My1{
public void hello();
public static void main(String args []){
}
}
interface My2 {
public void hi();
}
class  Result implements My1,My2{
public void hello() {
System.out.println("hihi");
}
public void hi(){
System.out.println("jj");
}
public static void main(String args [])
{
Result  r=new Result ();
r.hello();
r.hi();
}
}