 
import java.util.Arrays;
// if want use array class we need import frfom package
public class SortingOnArray {
public static void main(String[] args) {
	
	
	
	String[]  arr= {"Red","green","blue","white","ywll"};
	for (int i=0; i<arr.length;i++)
		System.out.println(arr[i]);//Red
	//green
	//blue
	//white
	//ywll

	System.out.println();// to give space
	
	Arrays.sort(arr);   // sorting inbuilkt method
	for (int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	
//Red
	//blue   ascending order
	//green
	//white
//	ywll
System.out.println();// to give space
Arrays.sort(arr); 
	for (int i=arr.length-1;i>=0;i--)
		System.out.println(arr[i]);

//Red
//blue
//green 
//white
//ywll
//
//ywll
//white
//green
//blue
//Red


			 
}

}


////o/pRed
//green
//blue
//white
//ywll
//Red
//blue
//green
//white
//ywll
//ywll
//white
//green
//blue
//Red
