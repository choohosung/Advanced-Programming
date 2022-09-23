package Week_13th;

class ExThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("ExThread1 Start");

	}
}

class ExThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("ExThread2 Start");
	}
}

public class Ex_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExThread1 t1 = new ExThread1();
		Thread t2 = new Thread(new ExThread2());
		// Runnable r = new ExThread2();
		// Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}
