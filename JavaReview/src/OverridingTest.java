
public class OverridingTest {
	public static void main(String[] args) {
		Mskim m1 = new Mskim();
		Sungeun s1 = new Sungeun();
		
		System.out.println(m1.bap());
		m1 = s1;
		//Mskim m1 = new Sungeun();�� ���� ȿ��
		System.out.println(m1.bap());
	}
}
class Mskim{		//�θ�Ŭ����
	public String bap() { //�޼��� '��'
		return "����"; //���� ����
		
	}
}
class Sungeun extends Mskim{ //�ڽ�Ŭ����
	public String bap() { //���� �޼��� '�������̵�'
		return "���";	//==> ��̸� ��µ�
	}
}