package com.Basic.Thread;

class FirstThread extends Thread {
	@Override
	public void run() {
		System.out.println("FirstThread......ThreadId :: " + Thread.currentThread().getId() + " Thread Name :: "
				+ Thread.currentThread().getName() + " Thread Priority :: " + Thread.currentThread().getPriority());
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
				if (Thread.interrupted()) {
					throw new InterruptedException();
				}
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
	}
}

class Multi extends Thread {
	@Override
	public void run() {
		System.out.println("Multi......ThreadId :: " + Thread.currentThread().getId() + " Thread Name :: "
				+ Thread.currentThread().getName() + " Thread Priority :: " + Thread.currentThread().getPriority());
	}

	public void getThreadName() {
		System.out.println(Thread.currentThread());
	}

}

public class ThreadExample {

	public static void main(String[] args) {

		Multi m1 = new Multi();
		// m1.start();

		FirstThread m2 = new FirstThread();
		FirstThread m3 = new FirstThread();

		// m2.start();
		// m3.start();

		FirstThread t1 = new FirstThread();
		FirstThread t2 = new FirstThread();
		FirstThread t3 = new FirstThread();
		try {
			t1.setPriority(Thread.MIN_PRIORITY);  
			t2.setPriority(Thread.NORM_PRIORITY);  
			t3.setPriority(Thread.MAX_PRIORITY);  
			  
			t1.setName("FirstThread");  
			t1.start();
			t1.join();
			t2.setName("SeconThread");  
			t2.start();
			t2.join();
			t3.setName("ThirdThread");  
			t3.start();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
