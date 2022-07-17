package Array;

public class nthbigest {
	public static void main(String[] args) {
		
	
	nthbigest ntha=new nthbigest();
	
	
int a[]= {45,67,23,38,34,29};
int big=ntha.nthbiggest(a,3);
System.out.println("3 rd biggest is "+big);
big=ntha.nthbiggest(a,4);
System.out.println("4th biggest is"+big);
}


//3 rd biggest is 38
	//4th biggest is34


// need methiod


public int nthbiggest(int []x,int n)// a,3// a,4
{
	  //     o    <5   i++        0,
	for(int i=0; i<x.length; i++)// 0///1///2////3////4///5
	{                            //45 ///67
		//45,67,23,38,34,29}
		// 0  1  2  3   4  5
		
		int count =0;
		       // 0    <5   j++  //  0,1,2,3,4,5 ///  //  0,1,2,3,4,5  //  0,1,2,3,4,5  //  0,1,2,3,4,5  //  0,1,2,3,4,5
		for(int j=0;j<x.length; j++)
		{
			//45,67,23,38,34,29}
			// 0  1  2  3   4  5
			
			if(x[j]>x[i])//  x[0]>x[0]=x[45]>x[45]  no  i=0;
				        //x[1]>x[0]=x[67]>x[45] yes i=0;
						//x[2]>x[0]=x[23]>x[45]  no i=0;
				//x[3]>x[0]=x[38]>x[45]  no  i=0;
				//x[4]>x[0]=x[34]>x[45]  no   i=0;
				//x[4]>x[0]=x[29>x[45]  n   i=0;
	//1///		///////	/ x[j]>x[i])//  i=1
			//  x[0]>x[1]=x[45]>x[67]  no   i=1
		        //x[1]>x[1]=x[67]>x[67] no       i=1
				//x[2]>x[1]=x[23]>x[67]  no  i=1
		//x[3]>x[1]=x[38]>x[67]  no  i=1
		//x[4]>x[1]=x[34]>x[67]  no   i=1
		//x[4]>x[1]=x[29>x[67]  no   i=1
 //2///		        ///////	/ x[j]>x[i])//  i=2
				//  x[0]>x[1]=x[45]>x[23]  no   i=2
			        //x[1]>x[1]=x[67]>x[23] no       i=2
					//x[2]>x[1]=x[23]>x[23]  no  i=2
			//x[3]>x[1]=x[38]>x[23]  yes  i=2    yes 
			//x[4]>x[1]=x[34]>x[23]  yes  i=2  yes
			//x[4]>x[1]=x[29>x[23]  yes   i=2  yes
			count++;// //  
		}
			if(count==n-1)// n is mentaiond in para// if(0==3-1)  no so -1 no result
				/// 67==3-1  67==2   no -1 so no need agin loop conunes
				
				////    
				return x[i];
		}
	   return -1;
	}
}



