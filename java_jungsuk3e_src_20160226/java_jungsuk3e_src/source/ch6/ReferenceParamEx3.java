class ReferenceParamEx3 {
	 //---------------클래스명
	public static void main(String[] args)
					// ---- -------- ----	
	{				// 메서드명   클래스명	  변수명
		int[] arr = new int[] {3,2,1,6,5,4};
	  //-----기본형 X,참조형변수!
		printArr(arr);  
	// --------------메서드명
		sortArr(arr);   
		printArr(arr);  
		System.out.println("sum="+sumArr(arr)); 
	} //------ --- -------		
	//	클래스명    변수명 메서드명	
	
	
	static void printArr(int[] arr) {  // 배열의 모든 요소를 출력
		System.out.print("[");

		for(int i : arr)  // 향상된 for문
			System.out.print(i+",");
		System.out.println("]");
	}

	static int sumArr(int[] arr) {  // 배열의 모든 요소의 합을 반환
		int sum = 0;

		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}

	static void sortArr(int[] arr) {  // 배열을 오름차순으로 정렬
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-1-i;j++)
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
	} // sortArr(int[] arr)
}
