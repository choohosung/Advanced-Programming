package Week_5th;

class Calculator{
	int[] result;
	int pos=-1;
	
	public Calculator() {
		result = new int[10];
	}
	public Calculator(int a) {
		result = new int[a];
	}
	
	public int exec(int a, int b, char c) {
		pos++;
		if(c == '+') {
			result[pos] = a+b;
		}
		else if(c == '-'){
			result[pos] = a-b;
		}
		else if(c == '*') {
			result[pos] = a*b;
		}
		else if(c == '/') {
			result[pos] = a/b;
		}	
		return result[pos];
	}
	public void prevResult() {
		if(pos == -1) {
			System.out.println("저장된 결과값이 없습니다.");
		}
		else {
			System.out.print("저장된 결과값 : ");
			for(int i=0; i<result.length;i++) {
				System.out.printf("%d ", result[i]);
			}
			System.out.print("\n");
		}
	}
}

public class assignment_1 {

	public static void main(String[] args) {
		System.out.println("2017113151 추호성");
		Calculator calc = new Calculator(4);
		calc.prevResult();
		System.out.println("5 + 7 = " + calc.exec(5, 7, '+'));
		calc.exec(5, 3, '-');
		calc.exec(9, 3, '/');
		calc.prevResult();
		calc.exec(10, 5, '*');
		calc.prevResult();
	}

}
