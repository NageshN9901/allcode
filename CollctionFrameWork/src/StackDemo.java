import java.util.Stack;

public class StackDemo{
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		st.push("nagesh");////[5   offset  )push is inbuiltmethod  is used to puish the elment into Stack
		st.push("mahesh");//4  offset
		st.push("pradeep");//3  offset
		st.push("suri");//2  offset
		st.push("abhi");//1  offset
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.peek());
		System.out.println(st.peek());
System.out.println(st.pop());
System.out.println(st);
System.out.println(st.pop());
System.out.println(st.search("nagesh"));
		System.out.println(st);
		System.out.println(st.search("al"));// -1 o/p becuse if data is not ther
		System.out.println(st.search("nagesh"));//it giving 5 becuse push will save dataa in the form of offset like 
		// first will go  to last to first
		//System.out.println(st.peek());// abhi peek will do firest data but its top lauyer data
//		System.out.println(st.pop());//abhi  its removed by pop
//		System.out.println(st.pop());//suri its removed by pop
//		System.out.println(st.search("abhi"));//-1 it sremoved
//		System.out.println(st.search("suri"));//-1 it is remoived becuse pop will remove from top l;ike last 
//		System.out.println(st);//[nagesh, mahesh, pradeep]
//System.out.println(st.empty());//false becuse some el;ement prsent sre theer 


	}
	

}

//class integerstack{
//	
//	Stack<Integer> sr=new Stack<>();
//	{
//		for (int i=0; i<5; i++)
//		{
//			sr.push(i);
//		}
//		yso 
//	}
//	yso
//}