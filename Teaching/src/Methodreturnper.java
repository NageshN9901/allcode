
public class Methodreturnper {
	
	
int girls(int p,int c,int m)
{
	int sum=p+c+m;
	return sum;/// girls group doing sum and returning to boys as output as input
	///System.out.println(sum); why is not coming ?
	
}




void boys(int sum)  //if sum =totalalso ok
{
	double perc=sum/300.0*100.0;//.0 is compalsary mandadatary //if sum =totalalso ok
	System.out.println("sum ;"+sum); //why its coming?
	System.out.println("percentage;  "+perc);
	
}
	
	
	public static void main(String[] args) {
		Methodreturnper  m=new Methodreturnper();
	int x=m.girls(98,70,70);
	m.boys(x);
	}
	
//	o/p
//	sum ;238
//	percentage;  79.33333333333333
//	
	
	
	
	
}
