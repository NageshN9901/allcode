
public class NonprimativearrayMobile {
	String name; String color; int price;
	NonprimativearrayMobile(String n,String c, int p)
	{
	this.name=n;  this.price=p; this.color=c; 
	}
	  public static void main(String[] args) {
		  NonprimativearrayMobile m1=new NonprimativearrayMobile("nagesh","whitee",11111);
		  
		  NonprimativearrayMobile m2=new NonprimativearrayMobile("mahes","red",22222);
		  
		  NonprimativearrayMobile m3=new NonprimativearrayMobile("rakes","block",33333);
		  NonprimativearrayMobile m4=new NonprimativearrayMobile("rakes","block",33333);
		  
		  NonprimativearrayMobile m[]= {m1,m2,m3,m4}; // becuse only 2 first objects detiles  // Array

		  //NonprimativearrayMobile m[]= {m1,m2,m3,m4}; // becuse only 2 first objects detiles  // Array
		  //for (int i=0;i<m.length-2;i++) same output
//		   System.out.println(m.length);
		       for (int i=0;i<m.length-2;i++)  // which reffrance index valuess 0;<2;  than 0,1
		       {
		    	   
		    	   System.out.println(m[i].name+" "+m[i].price+" "+m[i].color); // forward dierection only two first objects detils
		       }
		       
		     for (int i=m.length-3;i>=0;i--)  // baackward directiomn i=total; i
		     {
		    	 System.out.println(m[i].name+" "+m[i].price+" "+m[i].color);
		     }
		       
	}
	

	
}
