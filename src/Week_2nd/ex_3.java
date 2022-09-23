package Week_2nd;

public class ex_3 {

	public static void main(String[] args) {
		int year = 2021; // int 타입 선언 및 초기화
		//year = 2021.5; // -> 타입 불일치 에러 발생
		
		final int MAX = 1000; // 선언과 동시에 초기화 필요
		//MAX = 500; // -> 상수는 변경 불가. 에러 발생
		
		int inputNumber, outputNumber, curPos, lastPos; // 좋은 명명의 예
		int num1, num2, num3, num4; // 안좋은 명명의 예
		
		final int MAX_VALUE = 10; // 좋은 명명의 예
		final int maxval = 20; // 안좋은 명명의 예
	}
}
