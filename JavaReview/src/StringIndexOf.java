class StringIndexOf {
	public static void main(String[] args) {
		String fullName = "Hello.Java";
		
		//fullName���� .�� ��ġ�� ã�� ���� ����
		int index = fullName.indexOf('.');
		
		//Ȯ���ڸ� ������ '���ϸ�'�� ��ü�̸� �� 0��°�ڸ��� ���ں��� .�� ��ġ���� �߶� ���ڿ� 
		String fileName = fullName.substring(0,index);
		//									0�ڸ�����~index�ڸ�����
		//Ȯ���ڸ��� ��ü�̸����� .���Ϸ� �߶� ���ڿ�
		String ext = fullName.substring(index+1);
		
		System.out.println(fullName+"�� Ȯ���ڸ� ������ �̸��� =>"+fileName);
		System.out.println(fullName+"�� Ȯ���ڴ� =>"+ext);
		
		String fullName2 = "sldkjfglskdf.jsp";
		
		int index2=fullName2.indexOf('.');
		String fileName2 = fullName2.substring(0,index2);
		/*String ext2 = */
		
		System.out.println(fileName2);
		
	}
}
