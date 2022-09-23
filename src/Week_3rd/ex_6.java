package Week_3rd;

public class ex_6 {

	public static void main(String[] args) {
		// 조건문
		// if문
		int math = 80;
		if(math >= 80) {
			System.out.println("시험 통과");
			// System.out.println("축하드립니다");
		}
		
		// if-else문
		if(math>=80) {
			System.out.println("시험 통과");
		}else {
			System.out.println("시험 탈락");
		}
		
		// if-else if문
		if(math>=90) {
			System.out.println("시험 통과 A급");
		}else if(math>=80) {
			System.out.println("시험 통과 B급");
		}else {
			System.out.println("시험 탈락");
		}

	}

}
