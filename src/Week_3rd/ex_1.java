package Week_3rd;

public class ex_1 {

	public static void main(String[] args) {
		// ���� ������
		
		// ���� ������
		int x=0, y=0;
		y=++x;
		// ������
		// x = x + 1;
		// y = x;
		System.out.printf("x�� �� : %d, y�� �� : %d\n", x, y); // x=1, y=1
		
		// ������
		y=x++;
		// y = x;
		// x = x + 1;
		
		System.out.printf("x�� �� : %d, y�� �� : %d\n", x, y);
		
		// ��ȣ ������
		y = -x;
		System.out.printf("��ȣ ������ �� : %d, ��ȣ ������ �� : %d\n", x, y);

	}

}
