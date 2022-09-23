package Week_3rd;

public class ex_1 {

	public static void main(String[] args) {
		// 단항 연산자
		
		// 증감 연산자
		int x=0, y=0;
		y=++x;
		// 전위형
		// x = x + 1;
		// y = x;
		System.out.printf("x의 값 : %d, y의 값 : %d\n", x, y); // x=1, y=1
		
		// 후위형
		y=x++;
		// y = x;
		// x = x + 1;
		
		System.out.printf("x의 값 : %d, y의 값 : %d\n", x, y);
		
		// 부호 연산자
		y = -x;
		System.out.printf("부호 연산자 전 : %d, 부호 연산자 후 : %d\n", x, y);

	}

}
