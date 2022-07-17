import  java.util.*;
class TempConversion{
public static void main(String [] args){
Scanner   s=new Scanner(System.in);
double celsius;
System.out.println("enter temp in celsius");
 celsius =s.nextDouble();
System.out.println(" temp in fahernite"+" "+(9*(celsius) +( 32*5))/5);
}
}