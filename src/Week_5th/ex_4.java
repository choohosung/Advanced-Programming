package Week_5th;

public class ex_4 {
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		int [] math = new int[10];
		
		// 배열 초기화
		for(int i=0; i<math.length; i++)
			math[i] = i;
		
		for(int i=0; i<math.length; i++)
			System.out.printf("%d ", math[i]);
		System.out.println();
		
		// 배열 값 변경
		for(int i=0; i<math.length; i++)
			math[i] = 10-i;
		
		for(int i=0; i<math.length; i++)
			//System.out.printf("%d ", math[i]);
		//System.out.println();
		printArr(math);
		
		// 배열 값 재변경
		for(int i=0; i<math.length; i++)
			math[i] = i;
		
		printArr(math);
	}

}
