package stackRelted;
import java.util.*;
public class MainEnginestack {
	public static void main(String[] args) {
		MyStack stk=new MyStack(5);
		stk.push(23);//5
		stk.push(85);//4
		stk.push(89);//3
		stk.push(98);//2
		stk.push(45);// 1
		///stk.push(62);//
		System.out.println(stk);//[23,85,89,98,45]
		System.out.println(stk.search(85));//// this thing taken cosndrtion for understanding
		System.out.println(stk);
		
System.out.println(stk.pop());//45 top-- [23,85,89,98]
System.out.println(stk.pop());//98 top--[23,85,89]
System.out.println(stk);
		System.out.println(stk.peek());//89
		System.out.println(stk.peek());//89
		System.out.println(stk);//[23,85,89]
		System.out.println(stk.search(89));
	}
}
