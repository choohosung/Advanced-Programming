package Week_13th;

public class Ex_ExceptionFinally {

	   static void startInstall() { System.out.println("��ġ ����"); /* ���α׷� ��ġ�� ���� �ӽ� ������ ���� �������� */ }
	   static void copyFiles() { System.out.println("���� ����"); /* ���ϵ��� �����ϴ� �ڵ带 ���´�. */ }
	   static void deleteTempFiles() { System.out.println("�ӽ����� ����"); /* �ӽ� ���� ���� */ }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();		
			copyFiles();		 
			throw new Exception("���� �߻�"); // ���� �߻���Ű��
			// deleteTempFiles();	// �ߺ����� �޼��� ���� �ʿ�
		} catch (Exception e) {
			e.printStackTrace();
		    	// deleteTempFiles();   // �ߺ����� �޼��� ���� �ʿ�
		} finally {
	    	deleteTempFiles();   // ������ �߻����ο� ������� �׻� ����Ǵ� finally ���� ���
		}
	}

}
