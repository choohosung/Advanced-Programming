package Week_5th;

public class ex_5 {

	static int add(int a, int b)
	{
		int result = a + b;
		return result;
	}
	int minus(int a, int b)
	{
		int result = a - b;
		return result;		
	}
	
	/*// 오버로딩 예 - 매개변수 이름의 차이
	  static int add(int x, int y)
	{
		int result = x + y;
		return result;
	}
	*/
	
	/*// 오버로딩 예 2 - 반환 타입의 차이
	  static long add(int a, int b)
	{
		long result = a + b;
		return result;
	}
	*/
	
	/*// 오버로딩 예 3 - 매개변수 타입의 차이
	  static long add(long a, int b)
	{
		long result = a + b;
		return result;
	}
	*/
	
	// 오버로딩 예 4 - 매개변수 개수의 차이 2
	static int add(int a, int b, int c)
	{
		int result = a + b + c;
		return result;
	}
	
	public static void main(String[] args) {
		int result = add(3, 5);
		//short resShort = add(3, 5); //-> 자동 형변환이 될 수 있는 형을 반환 받아야함.
		int resParameter = add(3, 5, 6); //-> 매개변수가 많으면 안됨.
		System.out.println("add method 3 + 5 : " + result);
		System.out.println(resParameter);
		add(2, 4);

	}

}
