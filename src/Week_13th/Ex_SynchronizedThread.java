package Week_13th;

class Home {
    private boolean chickenArrived = false;

    public void eatChicken(){
    	System.out.println("치킨 주문 완료");
    	
        synchronized(this){
            while(!chickenArrived){
            	try	{
            		wait();
            	} catch(InterruptedException e) { }
            }
        }
        System.out.println("오늘 저녁은 치킨이닭 !");
    }

    public void diliveryMan(){
        synchronized(this){
        	System.out.println("배달 완료");
            this.chickenArrived = true;
            notifyAll();
        }
    }
}

class WaitThread implements Runnable {
	Home home = new Home();
    @Override
    public void run() {
    	home.eatChicken();
    }
}

class Task {
    int number = 0;
}

class SyncThread implements Runnable {
	Task task = new Task();
	int state;
    @Override
    public void run() {
    	//synchronized(this)
    	//{
   		task.number += 500;
   		System.out.println("쓰레드 수: " + task.number);
    	//}
    }
    
    SyncThread(int state){
    	this.state = state;
    }
}

public class Ex_SynchronizedThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncThread sh = new SyncThread(0);
		Thread th1 = new Thread(sh);
		Thread th2 = new Thread(sh);

		th1.start();
		th2.start();
		/*
		WaitThread wt = new WaitThread();
		Thread th3 = new Thread(wt);
		th3.start();
    	try	{
    		Thread.sleep(1000);
    	} catch(InterruptedException e) { }
    	wt.home.diliveryMan();
    	*/
	}

}
