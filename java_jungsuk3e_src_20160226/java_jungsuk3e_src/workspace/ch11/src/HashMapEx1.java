import java.util.*;

class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");  //-->처음 저장된 밸류값은 지워짐
		map.put("asdf", "1234");  //-->같은 키에 최종 저장된 밸류값이 불러짐

		Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();
			//			  ---------  ------ trim()으로 앞뒤 공백 지움
			//			  String으로 문자열(id)을 입력하고, 

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {//id가 map에 존재하지 않을 때
				// ----------------리턴타입: boolean true/false
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else { //id가 map에 존재할때
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");						
					break;
				}
			}
		} // while
	} // main의 끝
}
