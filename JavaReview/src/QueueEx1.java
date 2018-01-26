import java.util.*;

class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.println(">>");
			try {
				//ȭ�����κ��� ���δ����� �Է¹ޱ�
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				//�Է¹��� ���ڿ� ���� ������ �߶󳻱�
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - ������ �����ݴϴ�.");
					System.out.println("q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println("history - �ֱٿ� �Է��� ��ɾ"+MAX_SIZE+"�� �����ݴϴ�.");
				}else if(input.equalsIgnoreCase("history")) {
					int i=0;
					save(input); //�Է¹��� ��ɾ ����
					
					//LinkedList�� ������ ������
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i+"."+it.next());
					}
				}else {
					save(input);
					System.out.println(input);
				}
								
			}catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}//try-catch
		}//while
	}//main
	public static void save(String input) {
		//queue�� ����
		if(!"".equals(input))
			q.offer(input);
		
		//queue�� �ִ�ũ�⸦ �Ѿ�� ���� ó�� �Էµ� ���� ����
		if(q.size() >MAX_SIZE)//size()�� Collection�������̽��� ���ǵ� �� �����
			q.remove();
	}
	
}
