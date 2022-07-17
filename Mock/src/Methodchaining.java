
public class Methodchaining {
String name;
String color;
int price;
 int tax;// declring proprtes 

 
 //using conctrscter to intlize varible
 
 //Below
 Methodchaining (String i,String j , int y,int o){
	 this.name=i;
	 this.color=j;
	 this.price=y;
	 this.tax=o;
 }
 void sellingprice() {// one  method
	 
	 int sp=this.price+this.tax;
	 System.out.println("selling price"+sp);
 } 
 
 
 void detils() {// onether methiod calling intrnally onether methiod
	 
	 System.out.println(this.name);
	 System.out.println(this.color);
	 this.sellingprice();
 }
 
 public static void main(String[] args) {
	 Methodchaining m=new Methodchaining("honda","rede",26152,6256);
	 m.sellingprice();
	 m.detils();
}
}


