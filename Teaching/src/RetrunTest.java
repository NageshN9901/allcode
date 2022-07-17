
public class RetrunTest {
	
	int display()
	{
		
		System.out.println("display-1");
		return 10;//returing value
	}

	
	
	void display2()
	{
		System.out.println("display----2");
		
	}
	
	 public static void main(String[] args) {
		 RetrunTest r1=new RetrunTest();
		int q= r1.display();//int q is int is data type same given in method
			System.out.println(q);	
			System.out.println(r1.display());// we can get dircet output
			r1.display2();
	}
	
	
	
}

//o/p
//display-1
//10
//display----2