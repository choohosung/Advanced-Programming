package Week_4th;

public class ex_5 {

	public static void main(String[] args) {
		// String �迭
		  String[] name = new String[4];
	      name[0] = "Kim"; name[1] = "Lee"; name[2] = "Park"; name[3] = "Choi";
	      
	      // String Ŭ����
	      String str = "Hello";
	      String str2 = "Hello";
	      String str3 = new String("Hello");
	      String str4 = new String("Hello");
	      
	      System.out.println(str == "Hello");
	      System.out.println(str2 == "Hello");
	      System.out.println(str == str2);
	      System.out.println("----------------------");
	      System.out.println(str3 == "Hello");
	      System.out.println(str4 == "Hello");
	      System.out.println(str3 == str4);
	      System.out.println("----------------------");
	      System.out.println(str.equals(str3));
	      System.out.println(str3.equals(str4));
	      System.out.println("----------------------");      
	      str = str + name[0];
	      System.out.println(str == str2);
	      System.out.println("----------------------");
	      System.out.println(str.charAt(0)); // ���ڿ����� �ش� ��ġ�� �ִ� ���ڸ� ��ȯ
	      System.out.println(str.length()); // ���ڿ��� ���̸� ��ȯ
	      System.out.println(str.substring(1,3)); // ���ڿ��� ���̸� ��ȯ

	      char[] chArray = str.toCharArray(); // ����

	}

}
