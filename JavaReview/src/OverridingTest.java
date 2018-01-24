
public class OverridingTest {
	public static void main(String[] args) {
		Mskim m1 = new Mskim();
		Sungeun s1 = new Sungeun();
		
		System.out.println(m1.bap());
		m1 = s1;
		//Mskim m1 = new Sungeun();과 같은 효과
		System.out.println(m1.bap());
	}
}
class Mskim{		//부모클래스
	public String bap() { //메서드 '밥'
		return "현미"; //밥의 종류
		
	}
}
class Sungeun extends Mskim{ //자식클래스
	public String bap() { //같은 메서드 '오버라이딩'
		return "백미";	//==> 백미만 출력됨
	}
}