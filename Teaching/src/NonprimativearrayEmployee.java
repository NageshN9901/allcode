
public class NonprimativearrayEmployee { 
	String name;  // proprties
	int sal;
	
	NonprimativearrayEmployee(String n,int s)   //constreurter intailztion
	{
		
		this.name=n;  //intialztion
		this.sal=s;
	}

	void detils()   //method
	{
		
		
		System.out.println(this.name+"  "+this.sal);
	}
	
	
	public static void main(String[] args) {
		
		NonprimativearrayEmployee e1=new NonprimativearrayEmployee("rahul",1000002);  //object
		NonprimativearrayEmployee e2=new NonprimativearrayEmployee("virat",2000002);//object
		NonprimativearrayEmployee e3=new NonprimativearrayEmployee("raina",3000002);//object
		NonprimativearrayEmployee e4=new NonprimativearrayEmployee("dhone",4000002);//object
		
		//using synatx 2
		NonprimativearrayEmployee e[]= {e1,e2,e3,e4};  //Array
		for (int i=0;i<e.length;i++)
		{
			
			//System.out.println(e[i].detils);  dont use becuse  its alerdy used in method 
			e[i].detils();
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
