package Week_4th;

public class ex_1 {

	public static void main(String[] args) {
		// 배열의 선언, 생성
		
		int[] math = new int[4];
		math = new int[4];
		// int math[] = new int[4]; // 선언과 동시에 생성 가능

		
		// 배열의 초기화와 인덱스
		// 인덱스 = 배열의 최대 크기 - 1;
		// math[0] = 86; math [1] = 86; math [2]
		// math = {86, 95, 75, 100};
		math = new int[] {86, 95, 70, 100};
		
		// 배열의 길이 획득 및 사용 예
		// 배열의 길이 획득 배열명.length
		for(int i = 0; i<math.length;i++)
		{
			math[i] = i;
			System.out.println(math[i]);
		}
	}

}
