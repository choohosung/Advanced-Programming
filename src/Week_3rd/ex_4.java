package Week_3rd;

public class ex_4 {

	public static void main(String[] args) {
		// 비트 연산자
		// 2진수 a : 00000011
		// 2진수 b : 00000101
		int a = 3, b = 5, res = 0;
		res = a | b;
		System.out.println("a OR b : " + res); // 00000111
		res = a & b;
		System.out.println("a AND b : " + res); // 00000001
		res = a ^ b;
		System.out.println("a XOR b : " + res); // 00000110
		
		// 논리 연산자
		System.out.println("a > b OR a > 0 : " + (a>b || a>0));
		System.out.println("a > b AND a > 0 : " + (a>b && a>0));

	}

}
