package MATP;

public class TWODARRAY {
	public static void main(String[] args) {
		int a[] []= {{3,4,6,8},{9,8,5,4},{3,6,7,8}};// created 2d array
		//            0,1,2,3   0,1,2,3   0,1,2,3
		//               0        1         2
		System.out.println(a.length);// 3
		System.out.println(a[0].length);//4
		System.out.println(a[1].length);//4
		for(int i=0; i<a.length; i++)
		{
			
			for(int j=0; j<a[i].length ; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//3 4 6 8 
//9 8 5 4 
//3 6 7 8 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      