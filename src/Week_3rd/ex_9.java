package Week_3rd;

public class ex_9 {

	public static void main(String[] args) {
		// while문
		int num = 1;
		while(num < 10) {
			//System.out.println(num);
			num++;
			// num = 1; while 문 내 초기화 시 무한반복 오류
		}
		
		// for문으로 변환
		for(num = 1; num < 10; num++) {
			//System.out.println(num);
		}
		
		// do-while
		boolean bInit = false;
		do {
			if(num != 1 && bInit == false)
			{
				num = 1;
				bInit = true;
			}
			System.out.println(num);
			num++;
		}while(num<10);
	}
}
