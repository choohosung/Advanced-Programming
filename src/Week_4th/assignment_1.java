package Week_4th;

public class assignment_1 {
	
	public static void main(String[] args) {
		int[] number;
		number = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.print("초기 배열  :");
		
		for(int i = 0; i<number.length; i++)
			System.out.print(" " + number[i]);
		
		System.out.print("\n");
		
		for(int i = 0; i<number.length/2; i++) {
			int temp = number[i];
			number[i] = number[number.length-i-1];
			number[number.length-i-1] = temp;
		}
		System.out.print("역순 배열  :");
		for(int i = 0; i<number.length; i++)
			System.out.print(" " + number[i]);
	}

}
