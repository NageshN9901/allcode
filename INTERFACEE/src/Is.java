
public interface Is {

	
	void swon();
	void swof();
}

interface Ir {

	// its is not public becuse inside one intyerface is enugh to make public
	void insp();
	void desp();
}
	
	interface Hybrid extends Is,Ir{
		
		// by this one what is the use  means we can achive upcasting making this as parent
		//need to know
		void gg();
		
		
	}

