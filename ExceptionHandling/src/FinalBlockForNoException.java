// finally block used to close the coonections or Resoureses
// finally block excute at any condtion before program termention
public class FinalBlockForNoException {
	
	
	public static void main(String[] args) {
		System.out.println("STRAT");
		try {
			
			System.out.println("try blcok");
			
		}
		
		
		catch(Exception r)
		{
			System.out.println("catch block");
		}
		
		
		
		finally {
			
			System.out.println("finally blcokk");
		}
	}
}
//o/p
//STRAT
//try blcok
//finally blcokk
