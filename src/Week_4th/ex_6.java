package Week_4th;

public class ex_6 {

	public static void main(String[] args) {
		// StringBuffer Ŭ����
		
		StringBuffer sb = new StringBuffer("ABC"); // ���ڿ��� �Բ� ���� -> ���� ������ 19
		//StringBuffer sb = new StringBuffer(); // �⺻ ���� -> ���� ������ 16
		//StringBuffer sb = new StringBuffer(30); // ���ڿ� ���� 30 ������� ����
				
		System.out.println(sb);
		sb.append(123); // String�� �޸� ���� �߰� ����. ���� �߰��� �޼���. 
		System.out.println(sb);
		System.out.println("----------------------");
		System.out.println("sb  : " + sb.append(456).append(789));
		StringBuffer sb2 = new StringBuffer("ABC123456789");
		System.out.println("sb2 : " + sb2);

		System.out.println(sb.equals(sb2)); // equals�� ����ؼ� �� �Ұ���
		System.out.println(sb.toString().equals(sb2.toString())); 
		System.out.println("----------------------");

		System.out.printf("sb capacity = %d, length = %d\n", sb.capacity(), sb.length());
		System.out.println(sb.delete(3, sb.length()).toString());
		System.out.println(sb.deleteCharAt(2));
		System.out.println("----------------------");
				
		// StringBuffer �� ����ؼ� �Ʒ��� ���� ����Ͻÿ�.
		// ���� ���ڿ� : "Advanced Programming"
		// ��� ���ڿ� : "Enhanced Programming"
		//           "Enhanced Network"
	}

}
