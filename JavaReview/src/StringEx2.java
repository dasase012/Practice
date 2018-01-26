import java.util.HashMap;
import java.util.Map;

class StringEx2 {
	public static void main(String[] args) {
		String s1 = "AAA";
		String s2 = new String("AAA");
		Person1 p1 = new Person1();
		Person1 p2 = new Person1();
		System.out.println(p1.hashCode()+":"+p2.hashCode());
		if(s2.equals(s1))System.out.println("ok");
	
		Map map = new HashMap();
		map.put(p1, "p1");
		map.put(p2, "p2");
		
		System.out.println(map.size());
		//==> �ΰ��� ���� �ٸ� Ű,��� ���� ���������Ƿ� 2�����
		//==>equals�� �������̵� �ϰ� ���� ���� ���� �ٸ� �ּҰ��� ���� ���� �� �� �̹Ƿ� 2 ���
		//==>equals�� hashCode�� �Բ� �������̵� �� �Ŀ��� �ּ�,�ؽ��ڵ� ��� �������̵��ؼ�
		// �� ���� ���� ������ �����Ͽ����Ƿ� size 1�� ���.
	}
}
class Person1{
	int num=3;
	
	public boolean equals(Object obj) {
		Person1 p = (Person1)obj;
		return num==p.num;
	}
	
	public int hashCode() {
		return num;
	}
}
