package Week_13th;

class Thread1 extends Thread {
	public void run() {
		int[] num1 = new int[50];
		
		for(int i=0; i<num1.length; i++) {
			num1[i] = i + 1;
		}
		
		for(int i=0; i<num1.length; i++)
		{
			System.out.println("num : " + num1[i]);
		}

	}
}

class Thread2 extends Thread {
	public void run() {
		int[] num2 = new int[50];
		
		for(int i = 0; i<num2.length; i++) {
			num2[i] = i + 51;
		}
		
		for(int i=0; i<num2.length; i++)
		{
			System.out.println("num : " + num2[i]);
		}

	}
}

public class assignment_3 {

	public static void main(String[] args) {
		Thread1 mt1 = new Thread1();
		Thread2 mt2 = new Thread2();
		
		mt1.start();
		mt2.start();
	}
}
