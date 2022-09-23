package Week_3rd;

public class ex_8 {

	public static void main(String[] args) {
		// 반복문
		// for문
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1부터 10까지 더한 결과 : " + sum);
		//System.out.println("반복문 내 변수 i : " + i);
		
		// 중첩 for문
		// 구구단 출력 예
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++)
				System.out.println(i + "*" + j + "=" + (i*j));
		}
	}
}
