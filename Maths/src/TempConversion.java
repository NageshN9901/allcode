
import  java.util.*;
class TempConversion{
 

public static void main(String [] args){
Scanner   s=new Scanner(System.in);
double fahrenite,celsius,conversion;
System.out.println("enter temp in celsius");
 celsius =s.nextDouble();
System.out.println(" temp in fahernite"+" "+(9*(celsius) +( 32*5))/5);
 //conversion=(9*(celsius) +( 32*5))/5; we cas
// System.out.println(" temp in fahernite"+" "+conversion);
}
}





//for celsius to fahrenite (9*(celsius) +( 32*5))/5
//fahrenite to celsius (5*(fahrenite-32))/9