
public class NonprimativearrayCar {


	public static void main(String[] args) {


		//using synatx 1

		String a[]=new  String[5];

		a[0]="honda";
		a[1]="bmw";
		a[2]="tata";
		a[3]="suzuki";
		a[4]="kie";


		//select last 3 data sonly by farward direction using for lopp

		for (int i=2; i<=4;i++)    //last three for farward direction
		{

			System.out.println(a[i]);
		}




		for (int i=4; i>=2;i--)  //last three for backward direction
		{

			System.out.println(a[i]);
		}




	}

}
