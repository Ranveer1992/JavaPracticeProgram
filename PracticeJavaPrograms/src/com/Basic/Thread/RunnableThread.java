package com.Basic.Thread;

class SecondRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("Multi......ThreadId :: " + Thread.currentThread().getId() + " Thread Name :: "
				+ Thread.currentThread().getName() + " Thread Priority :: " + Thread.currentThread().getPriority());

		
	}

}

public class RunnableThread {

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Thread t1 = new Thread(new SecondRunable());
			t1.start();
		}
	}

}
