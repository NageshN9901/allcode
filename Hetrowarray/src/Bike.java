
public class Bike {

	
	
	String name,color;

//	@Override // take right click 
//public String toString() {
//	return "Bike [name=" + name + ", color=" + color + "]";
	public String toString() {
	return this.name+" "+this.color;
	}
	
// without string to string we will get address
//	Bike@15db9742
//	Bike@6d06d69c
//	Bike@7852e922
//	Car@4e25154f
//	Car@70dea4e
//	Car@5c647e05
//	500
//	ABHI
//
//	


	public Bike(String name, String color) {
		//super();
		this.name = name;
		this.color = color;  // ctreate construcetr right click source creste automatied constrers	
	}
	
}
class Car 
{
	String brand;
	int price;
	
	
	public String toString() {
		return this.brand+this.brand;
	}
//	
//	@Override
//	public String toString() { //
//		return "Car [brand=" + brand + ", price=" + price + "]";
//	}




	public Car(String brand, int price) {
		//super();
		this.brand = brand;
		this.price = price;
	}

}
//
//	@Override
//	public String toString() {
//		return "Car [brand=" + brand + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}
	
	
	