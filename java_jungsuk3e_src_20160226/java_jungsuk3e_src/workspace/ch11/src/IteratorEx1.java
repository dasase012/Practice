import java.util.*;

class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	//	List   	   list=new ArrayList();
	//  Collection list=new ArrayList();
	//다 상속관계이므로 가능
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();
	//	--------		   ----------접근제한자(public),리턴타입(Iterator),매개변수x
		while(it.hasNext()) {
			//   =======다음 내용이 있습니까 hasNext()
			Object obj = it.next();//있다면 읽어내세요 next()
			System.out.println(obj);
			//		   =======(참조형변수)를 찍으면 참조형변수가 가리키는 생성자로 가서 toString 내용 프린트함. 
		}
	} // main
}
