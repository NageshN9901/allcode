package Array;
import java.util.Scanner;
public class Arrayopertions {
//create one method   
	
	
	/// to read all integeres  method defination
	int [] readArray() {// return type with mmethod name
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size of an array");
		int n=sc.nextInt();// to enter the readingsint 
		int ar[]=new int[n];  //memory allction to array
		System.out.println("enetr "+n+"integer");
		for(int i=0; i<ar.length; i++) {
			
			
			ar[i]=sc.nextInt();// storing one by one accroing to index
		}
		
		
		return ar;// now return type is int []
	}
	
	
	void displayArray(int ar[])// givinf readmethiod ouput to display method asinput
	{
		
		
		for (int i=0; i<ar.length; i++)
		{
			
			System.out.println(ar[i]+" ");
		}
	
	}
	
	// need to create one mthod to make sum of all elements
	int sumofArray(int ar[]){
		
		int sum=0;// intaly take sum=0 for sum   counting  opertions
	for(int i=0; i<ar.length; i++)
	{
		
		
		sum=sum+ar[i];
	}
	return sum;
		
	}
	
	// to find bigest elemnt in arry  by methiod
	int Bigest(int ar[])
	{
int big =ar[0];
for(int i =0; i<ar.length; i++) {
	if(ar[i]>big)
		big=ar[i];
}
       return big;    

		
		
		
	}
	void evenandodd(int ar[])
	{
		
		int ec=0; int oc=0;
		for(int i=0;i<ar.length;i++)
		{
		if(ar[i]%2==0)
			ec++;
		else 
		 oc++;
		
		}
		System.out.println(ec);
		System.out.println(oc);
		//return ec;// we cant make 2 return types
		//return oc;
	}
	
	public static void main(String[] args) {
		Arrayopertions ao=new Arrayopertions();
	int []x=ao.	readArray();// stroing one mthod in x container with same return type data tuype
		System.out.println("user entrdf Arrayelments");
		ao.displayArray(x);// no need of storing in contere becsue it is not return type
int sum=ao.sumofArray(x);// need to pass product or values stried contener to do opertions 
		System.out.println("sum of elements "+sum);
		System.out.println("number of even and odd number ");
	ao.evenandodd(x);// for even and odd 
int biger=ao.Bigest(x);
System.out.println("bigest elemnt in array  "+biger);
	}
	
}
