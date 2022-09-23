package Week_13th;

class YieldThreadA extends Thread {
	boolean doWork = true; // �۾� ����Ȯ�� 
	boolean stop = false;  // ������ ���� Ȯ��
	public void run() {
		while(!stop) {
			if(doWork) { 
				System.out.println("������ A�� �۾����Դϴ�.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			else { 
				Thread.yield(); // �۾����� ���� �� �ٸ� �����忡 �纸
			}
		}
		System.out.println("������ A�� ����Ǿ����ϴ�.");			
	}
}

class YieldThreadB extends Thread {
	boolean doWork = true; // �۾� ����Ȯ�� 
	boolean stop = false;  // ������ ���� Ȯ��
	public void run() {
		while(!stop) {
			if(doWork) { 
				System.out.println("������ B�� �۾����Դϴ�.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			else { 
				Thread.yield(); // �۾����� ���� �� �ٸ� �����忡 �纸
			}
		}
		System.out.println("������ B�� ����Ǿ����ϴ�.");
	}
}

public class Ex_ThreadControl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldThreadA th1 = new YieldThreadA();
		YieldThreadB th2 = new YieldThreadB();
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		th1.doWork = false;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		th1.doWork = true;
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { }
		th1.stop = true;
		th2.stop = true;
	}

}
