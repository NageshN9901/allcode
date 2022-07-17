
public class Stu {



	public static void main(String[] args) {

		Object R[]=new Object[7];
		R[0]="qonda"; R[1]="wonda";

		R[2]="eonda";
		R[3]="ronda";
		R[4]="tonda";
		R[5]="yonda";
		R[6]="uganada";

		for(int i=0;i<R.length;i++)
		{
			System.out.println(R[i]);
		}

		for (int i=R.length-1;i>=0;i--)
			System.out.println(R[i]); 

	}
}
