package Week_13th;

class Thread3 extends Thread {
	public void run() {
		int[] num3 = new int[50];
		
		for(int i=0; i<num3.length; i++) {
			num3[i] = i + 1;
		}
		
		for(int i=0; i<num3.length; i++)
		{
			System.out.println("num : " + num3[i]);
		}
	}
}

class Thread4 extends Thread {
	public void run() {
		int[] num4 = new int[50];
		
		for(int i=0; i<num4.length; i++) {
			num4[i] = i + 51;
		}
		
		for(int i=0; i<num4.length; i++)
		{
			System.out.println("num : " + num4[i]);
		}
	}
}

public class assignment_3_2 {

	public static void main(String[] args) {
		Thread3 mt3 = new Thread3();
		Thread4 mt4 = new Thread4();
		
		try {
			mt3.start();
			mt3.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		} finally {
			mt4.start();
		}
	}

}
