package stackRelted;



public class MyStack {// this classs belong to base classs
Object obj[];// created new objcet becuse it should acceot any type of object or data type
int capacity,top; // capacity taken to intlize the givem type in its original stacj

// need one  consturcter to make that things intilze
public MyStack(int capacity)
{
	
	this.top=-1;// why -1 means becuse we are stroing the avlues in array but we need realy stack is no0t array based it statrs with 1that way
	this.capacity=capacity;// here we can makeing full capacity take how the user input gives fir size
	//Object 	obj=new Object[capacity];
	 	obj=new Object[capacity];// new object creted for that class
}

// push method
public void push(Object ele) {// passing that object it can accpet any types
	
	if(top==capacity-1)// (-1==n-1)// means (-1==5-1)//(0==5-1)//(1==5-1)/(2==5-1)//(3==5-1)//(4==5-1)// (5==5-1)
	{                                            //1     //2       //3      //  4   // 5    //>>>>stack ovrerflow
		System.out.println("stackn is overflow");
		return;
	}
	  obj[++top]=ele;// obj[++top]=ele////obj[++-1]=23// obj[++1]=83/ obj[++2]=89////obj[++3]=89/obj[++4]=98//obj[++5]=45/obj[++6]=45
	                                       //1              2            3            4       // stack overflow   :>>>>>>
	  // now top value is 4 so below goes every same
}
// from abouve we are gettinmg object adress so we need detils so go for tostring 
// here top value is 4 
public String toString() {// to get output in the form 
	
	String st="[";
	for(int i=0; i<=top; i++)// if n=5 top will be 4  i=0 i=1 i=2 i=3 i=4 top 4
	{
		st=st+obj[i];//[0 [0,1;//  [0,1,2//  [0,1,2,3      [0,1,2,3,4
		             //[23 [23,85  [23,85,89 [23,85,89,98   [23,85,89,98,45
		if(i<top)//   0<4  //1<4 yes// 2<4 yes  3<4 yes
			st=st+",";//  we are adding comma Here string tAKE ALL SO // [0,\\[0,1,// [0,1,2//  [0, 1,2,3//  [0,1,2,3,4 //   condtion ends i<yop 4<4 no 
		                                                               //[23, [23,85  [23,85,89 [23,85,89,98 [23,85,89,98,45
	}
	return st+"]";// [1,2,3,4 // it will add ] finally returns   [0,1,2,3,4]==  [23,85,89,98,45]
}

public Object pop() {// passing object we are passing  in collection in he form objcet only so rteu8rn also same
	if(top==-1)//  (-1==-1) when it becomes 
	{
		
		System.out.println("stack is unerflow  no data present inside stack");
	return null;
}

 return obj[top--];// obj[4--]//obj[3--]//obj[2--]//obj[--1//// onj[--0]//obj[---1]/// so here it will hre is no 
 
	// how many times pop method word used that many times the top -- from  last
 // here top value is 2  like 0 1 2 //becuse 2 tims pop done in engine main method other wise 0,1,2,3,4 so 4 that time
}
public Object peek() {
	if(top==-1)// when (-1=-1)
	{
		
		System.out.println("stack is under flow data is not present ");
		return null;
	}
	return  obj[top];// obj[4] if pop one obj[3]// obj [2]  it deced by pop method other wise same last value 
	// top val.ue	 is last value that is 2 only after pop other wise 4
}

public int search (Object r)// in stack search last to first
{
	
	for(int i=top; i>=0; i--)///in stack search last to first
	{
		if(r.equals(obj[i]))// 85.equals(obj[4] but from last it is in 4 ==85.equals(obj[85] yes go inside
			return top-i+1;// 4-4+1=  here top is 4-4+1 =1// 0,1 = 23,85 so 85 is answer output
	}
	return -1;/// if its is not there it will gives output as -1
}
}
