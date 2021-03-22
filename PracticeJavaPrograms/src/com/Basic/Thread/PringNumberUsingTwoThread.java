package com.Basic.Thread;

public class PringNumberUsingTwoThread {
	static int N;
	int counter = 1;

	protected void printOddNumber() {
		synchronized (this) {
			// Print number till the N
			while (counter < N) {
				// If count is even then print
				while (counter % 2 == 0) {
					// Exception handle
					try {
						Thread.sleep(1000);
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				// Print the number
				System.out.println("Odd=>" + counter + " ");
				// Increment counter
				counter++;
				// Notify to second thread
				notify();
			}
		}

	}

	protected void printEvenNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {
					try {
						Thread.sleep(1000);
						wait();
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("Even=>" + counter + " ");
				counter++;
				// Notify to 2nd thread
				notify();
			}
		}

	}

	public static void main(String[] args) {
		N = 10;
		PringNumberUsingTwoThread mt = new PringNumberUsingTwoThread();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				mt.printEvenNumber();

			}

		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				mt.printOddNumber();
			}

		});

		// start both thread
		t1.start();
		t2.start();
	}

}
