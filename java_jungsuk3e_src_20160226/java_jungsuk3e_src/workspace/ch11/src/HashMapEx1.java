import java.util.*;

class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");  //-->ó�� ����� ������� ������
		map.put("asdf", "1234");  //-->���� Ű�� ���� ����� ������� �ҷ���

		Scanner s = new Scanner(System.in);	// ȭ�����κ��� ���δ����� �Է¹޴´�.

		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			//			  ---------  ------ trim()���� �յ� ���� ����
			//			  String���� ���ڿ�(id)�� �Է��ϰ�, 

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {//id�� map�� �������� ���� ��
				// ----------------����Ÿ��: boolean true/false
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else { //id�� map�� �����Ҷ�
				if(!(map.get(id)).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");						
					break;
				}
			}
		} // while
	} // main�� ��
}
