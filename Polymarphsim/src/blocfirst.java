
public class blocfirst {
	{
		System.out.println("block");
	}
	
	
	blocfirst (){
		super();
		
		
		System.out.println("constructer");
	}
	
	{
		System.out.println("block1");
	}
	public static void main(String[] args) {
		blocfirst t=new  blocfirst();
	}
}
  
//block
//block1
//constructer