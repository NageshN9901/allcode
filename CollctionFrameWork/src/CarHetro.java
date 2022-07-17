
	
public class CarHetro {
		String brand;
		int price ;
		  //constructer
		
		public CarHetro(String brand, int preice) {
			super();
			this.brand = brand;
			this.price = preice;
		}

		@Override
		public String toString() {
			return brand+" "+price;
		}
		
		// to string methos
		
}