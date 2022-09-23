package Week_3rd;

public class ex_2 {

	public static void main(String[] args) {
		// 형변화 연산자
		double avg = 90.5;
		int score = (int)avg;
		
		System.out.printf("avg의 값 : %f, score의 값 : %d\n", avg, score);
		
		char ch = '0'; // Unicode 48
		int temp = (int)ch;
		
		System.out.printf("ch의 값 : %c, temp의 값 : %d\n", ch, temp);
		
		// 자동 형변환
		// int pi = 3.14; 작은 값 -> 큰 값 에러 발생, 수동 형변화 필요
		
		double dAuto = 314; // 큰 값 -> 작은 값 가능
		double dManual = (double)314;
		
		System.out.printf("자동 형변환 double 값 : %f, 수동 형변환 double 값 : %f\n", dAuto, dManual);
		
		score = 400;
		byte bScore = (byte)score;
		
		System.out.printf("int score의 값 : %d, 수동 형변환 bScore의 값 : %d\n", score, bScore);
		// 논리부정 연산자
		boolean bOn = false;
		System.out.println("논리부정 연산 결과 : "+ !bOn);
		// 비트전환 연산자
		// 10진수 12  : 00001101
		// 10진수 -13 : 11110010
		score = 12;
		System.out.printf("score = %d, 비트전환 연산 결과 = %d\n", score, ~score);

	}

}
