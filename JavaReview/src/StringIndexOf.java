class StringIndexOf {
	public static void main(String[] args) {
		String fullName = "Hello.Java";
		
		//fullName에서 .의 위치를 찾는 변수 선언
		int index = fullName.indexOf('.');
		
		//확장자를 제외한 '파일명'은 전체이름 중 0번째자리의 문자부터 .의 위치까지 잘라낸 문자열 
		String fileName = fullName.substring(0,index);
		//									0자리부터~index자리까지
		//확장자명은 전체이름에서 .이하로 잘라낸 문자열
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName+"의 확장자를 제외한 이름은 =>"+fileName);
		System.out.println(fullName+"의 확장자는 =>"+ext);
		
		String fullName2 = "sldkjfglskdf.jsp";
		
		int index2=fullName2.indexOf('.');
		String fileName2 = fullName2.substring(0,index2);
		/*String ext2 = */
		
		System.out.println(fileName2);
		
	}
}
