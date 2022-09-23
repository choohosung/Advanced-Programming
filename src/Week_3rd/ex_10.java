package Week_3rd;

public class ex_10 {

	public static void main(String[] args) {
		// break문
		int i = 0, sum = 0;
		while(true) {
			i++;
			sum += i;
			
			if(sum > 50)
				break;
		}
		//System.out.println("1부터 10까지의 합 : " + sum);
		
		// coutinue문
		for(i = 1; i<=10; i++) {
			if(i%2 == 0)
				continue;
			//System.out.println(i);
		}
		
		// 이름붙은 반복문
		Loop1 : for(i=2;i<100;i++) {
			for(int j=1;j<10;j++) {
				if(i==10)
					break Loop1;
				    System.out.println(i + "*" + j + "=" + (i*j));
			}
		}

	}

}
