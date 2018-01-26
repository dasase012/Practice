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
		//==> 두가지 서로 다른 키,밸류 셋이 들어와있으므로 2개출력
		//==>equals만 오버라이딩 하고 났을 때도 서로 다른 주소값을 가진 셋이 두 개 이므로 2 출력
		//==>equals와 hashCode가 함께 오버라이딩 된 후에는 주소,해시코드 모두 오버라이딩해서
		// 두 셋의 값이 같음을 증명하였으므로 size 1로 출력.
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
