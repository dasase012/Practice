import java.util.*;

class IteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
	//	List   	   list=new ArrayList();
	//  Collection list=new ArrayList();
	//�� ��Ӱ����̹Ƿ� ����
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();
	//	--------		   ----------����������(public),����Ÿ��(Iterator),�Ű�����x
		while(it.hasNext()) {
			//   =======���� ������ �ֽ��ϱ� hasNext()
			Object obj = it.next();//�ִٸ� �о���� next()
			System.out.println(obj);
			//		   =======(����������)�� ������ ������������ ����Ű�� �����ڷ� ���� toString ���� ����Ʈ��. 
		}
	} // main
}
