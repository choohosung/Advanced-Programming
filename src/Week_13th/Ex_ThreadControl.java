package Week_13th;

class InterruptedThread extends Thread
{ 
	@Override
	public void run() {
		try {
			while(true) {
				//Thread.sleep(200);
				System.out.println("������");
				Thread.sleep(200);
			}
		} catch(InterruptedException e) {
			System.out.println("Interrupted �߻�");
		}
		
		System.out.println("��������");
	}
} 

public class Ex_ThreadControl {
	static boolean status;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterruptedThread th = new InterruptedThread();
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		
		th.interrupt();
	}
}
