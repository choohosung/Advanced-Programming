package Week_4th;

public class ex_1 {

	public static void main(String[] args) {
		// �迭�� ����, ����
		
		int[] math = new int[4];
		math = new int[4];
		// int math[] = new int[4]; // ����� ���ÿ� ���� ����

		
		// �迭�� �ʱ�ȭ�� �ε���
		// �ε��� = �迭�� �ִ� ũ�� - 1;
		// math[0] = 86; math [1] = 86; math [2]
		// math = {86, 95, 75, 100};
		math = new int[] {86, 95, 70, 100};
		
		// �迭�� ���� ȹ�� �� ��� ��
		// �迭�� ���� ȹ�� �迭��.length
		for(int i = 0; i<math.length;i++)
		{
			math[i] = i;
			System.out.println(math[i]);
		}
	}

}
