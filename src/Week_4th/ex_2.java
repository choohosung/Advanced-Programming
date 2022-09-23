package Week_4th;

public class ex_2 {

	public static void main(String[] args) {
		// 다차원 배열
		
		int[][] score = new int[5][4]; // 다차원 배열 선언 및 생성
		
		// 배열 초기화
		score[0] = new int[] { 100, 97, 67, 99};
		score[1] = new int[] { 75, 86, 83, 91};
		score[2] = new int[] { 80, 72, 85, 84};
		
		// 가변 배열
		score[3] = new int[] { 95, 66};
		score[4] = new int[] { 94, 97, 100};
		
		// 출력 예제
		for(int i=0; i<score[0].length; i++)
		{
			if(i==0)
				System.out.printf("0행 데이터 : ");
			System.out.printf("%d ", score[0][i]);
		}
		// 아래와 같이 배열을 초기화 하고 출력해보시오.
		// 배열 크기 - 3x3, 배열 타입 - int
		// 데이터 : 2의 승수, 3의 승수, 4의 승수
		// 중첩 for문을 사용해서 출력.
	}

}
