package Week_13th;

class YieldThreadA extends Thread {
	boolean doWork = true; // 작업 진행확인 
	boolean stop = false;  // 쓰레드 종료 확인
	public void run() {
		while(!stop) {
			if(doWork) { 
				System.out.println("쓰레드 A가 작업중입니다.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			else { 
				Thread.yield(); // 작업하지 않을 때 다른 스레드에 양보
			}
		}
		System.out.println("쓰레드 A가 종료되었습니다.");			
	}
}

class YieldThreadB extends Thread {
	boolean doWork = true; // 작업 진행확인 
	boolean stop = false;  // 쓰레드 종료 확인
	public void run() {
		while(!stop) {
			if(doWork) { 
				System.out.println("쓰레드 B가 작업중입니다.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			else { 
				Thread.yield(); // 작업하지 않을 때 다른 스레드에 양보
			}
		}
		System.out.println("쓰레드 B가 종료되었습니다.");
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
