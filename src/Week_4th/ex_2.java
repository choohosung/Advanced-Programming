package Week_4th;

public class ex_2 {

	public static void main(String[] args) {
		// ������ �迭
		
		int[][] score = new int[5][4]; // ������ �迭 ���� �� ����
		
		// �迭 �ʱ�ȭ
		score[0] = new int[] { 100, 97, 67, 99};
		score[1] = new int[] { 75, 86, 83, 91};
		score[2] = new int[] { 80, 72, 85, 84};
		
		// ���� �迭
		score[3] = new int[] { 95, 66};
		score[4] = new int[] { 94, 97, 100};
		
		// ��� ����
		for(int i=0; i<score[0].length; i++)
		{
			if(i==0)
				System.out.printf("0�� ������ : ");
			System.out.printf("%d ", score[0][i]);
		}
		// �Ʒ��� ���� �迭�� �ʱ�ȭ �ϰ� ����غ��ÿ�.
		// �迭 ũ�� - 3x3, �迭 Ÿ�� - int
		// ������ : 2�� �¼�, 3�� �¼�, 4�� �¼�
		// ��ø for���� ����ؼ� ���.
	}

}
