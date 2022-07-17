package stackRelted;
import java.util.*;
public class BehivourIOfStack {
public static void main(String[] args) {
	Stack st=new Stack();
 st.push(23);
 st.push(89);
 st.push(44);
 st.push(32);
 st.push(89);
 System.out.println(st);//[23, 89, 44, 32, 89]
 System.out.println(st.pop());//89// it gives last value only oe one at time
 System.out.println(st.pop());//32
 System.out.println(st.peek());
 System.out.println(st);//[23, 89, 44]
 System.out.println(st.peek());//44
 System.out.println(st.peek());//44
// [23, 89, 44, 32, 89]
//		 89
//		 32
//		 44
//		 [23, 89, 44]
//		 44
//		 44

}
}
