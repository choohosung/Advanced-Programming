package Week_4th;

public class assignment_3 {

	public static void main(String[] args) {
		String str = new String("Working");
		StringBuffer sb = new StringBuffer("Break Time");
		sb = new StringBuffer(str);
		System.out.println(sb);
		if(str.toString().equals(sb.toString()))
			System.out.println("str�� sb�� ���� ���ڿ� �Դϴ�.");
		else
			System.out.println("str�� sb�� �ٸ� ���ڿ� �Դϴ�.");
	}

}
