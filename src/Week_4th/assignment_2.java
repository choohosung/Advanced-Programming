package Week_4th;

public class assignment_2 {

	public static void main(String[] args) {
		int[][] number;
		number = new int[10][10];
		for(int i = 2; i<number.length; i++) {
			System.out.print(i + "´Ü : ");
			for(int j = 1; j<number.length; j++) {
				number[i][j] = i*j;
				System.out.print(i+"*"+j+"="+number[i][j]+" ");
			}
			System.out.print("\n");
		}
	}

}
