
public class Methodreturnpara {
    int dis( int a)
    {
    
    	System.out.println("returing parameters");
    	return a;
    }
    
    
    
    public static void main(String[] args) {
    	Methodreturnpara m=new Methodreturnpara();
    int x=m.dis(200);
    System.out.println(x);
	}
}
//o/p
//returing parameters
//200
