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
	
	/*// �����ε� �� - �Ű����� �̸��� ����
	  static int add(int x, int y)
	{
		int result = x + y;
		return result;
	}
	*/
	
	/*// �����ε� �� 2 - ��ȯ Ÿ���� ����
	  static long add(int a, int b)
	{
		long result = a + b;
		return result;
	}
	*/
	
	/*// �����ε� �� 3 - �Ű����� Ÿ���� ����
	  static long add(long a, int b)
	{
		long result = a + b;
		return result;
	}
	*/
	
	// �����ε� �� 4 - �Ű����� ������ ���� 2
	static int add(int a, int b, int c)
	{
		int result = a + b + c;
		return result;
	}
	
	public static void main(String[] args) {
		int result = add(3, 5);
		//short resShort = add(3, 5); //-> �ڵ� ����ȯ�� �� �� �ִ� ���� ��ȯ �޾ƾ���.
		int resParameter = add(3, 5, 6); //-> �Ű������� ������ �ȵ�.
		System.out.println("add method 3 + 5 : " + result);
		System.out.println(resParameter);
		add(2, 4);

	}

}
