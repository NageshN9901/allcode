
public class MethodInsideMethod1 {

	
	interface my{
		void run();
	}
	static void foo()
	{
		my r=new my() {
			public void run()
			{
				System.out.println("hi");
				
			};
		};
	
		r.run();
}
	public static void main(String[] args) {
		foo();
	}
}

