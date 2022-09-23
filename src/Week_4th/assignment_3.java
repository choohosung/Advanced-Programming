package Week_4th;

public class assignment_3 {

	public static void main(String[] args) {
		String str = new String("Working");
		StringBuffer sb = new StringBuffer("Break Time");
		sb = new StringBuffer(str);
		System.out.println(sb);
		if(str.toString().equals(sb.toString()))
			System.out.println("str와 sb는 같은 문자열 입니다.");
		else
			System.out.println("str와 sb는 다른 문자열 입니다.");
	}

}
