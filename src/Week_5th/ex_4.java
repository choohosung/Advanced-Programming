package Week_5th;

public class ex_4 {
	
	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.println();
	}

	public static void main(String[] args) {
		int [] math = new int[10];
		
		// �迭 �ʱ�ȭ
		for(int i=0; i<math.length; i++)
			math[i] = i;
		
		for(int i=0; i<math.length; i++)
			System.out.printf("%d ", math[i]);
		System.out.println();
		
		// �迭 �� ����
		for(int i=0; i<math.length; i++)
			math[i] = 10-i;
		
		for(int i=0; i<math.length; i++)
			//System.out.printf("%d ", math[i]);
		//System.out.println();
		printArr(math);
		
		// �迭 �� �纯��
		for(int i=0; i<math.length; i++)
			math[i] = i;
		
		printArr(math);
	}

}
