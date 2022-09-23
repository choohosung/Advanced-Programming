package Week_14th;
import java.util.*;

public class Ex_PrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 65;
		float f = 1234.56789f;
		Date d = new Date();

		// 형식화된 문자열에 대한 매개변수의 개수는 항상 일치해야 함.
		System.out.printf("문자 %c의 코드는 %d%n", i, i);
		System.out.printf("%d는 8진수로 %o, 16진수로 %x%n", i ,i, i);
		System.out.printf("%3d%3d%3d%n", 100, 90, 80);
		System.out.println();
		System.out.printf("123456789012345678901234567890%n");
		System.out.printf("%s%-5s%5s%n", "123", "123", "123");
		System.out.println();
		System.out.printf("%-8.1f%8.1f %e%n",f,f,f);
		System.out.println();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.%n", d,d,d );
		System.out.printf("지금은 %tH시 %tM분 %tS초 입니다.%n", d,d,d );
		System.out.printf("지금은 %1$tH시 %1$tM분 %1$tS초 입니다.%n", d );
		// 매개변수가 일치하지 않음.
		// 앞에 1$는 첫번째 매개변수를 의미함. 따라서 전부 첫번째 매개변수로 적용됨.
	}

}
