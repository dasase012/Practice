import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
	public static void main(String[] args) {
		Stack st=new Stack();
		Queue q=new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("=Stack="); //==>FI,LO
		while(!st.empty()) { //stack이 비어있지 않을때까지, 내용이 있는 동안
			System.out.println(st.pop());//stack의 내용물을 하나씩 꺼내라
		}
		System.out.println("=Queue=");//==>FI,FO
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
