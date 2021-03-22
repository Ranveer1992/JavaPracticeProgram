package com.basic.example.demo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Downloader extends TimerTask {
	static int counter = 0;
	static int functionCallTime = 1;
	Timer timerObj;
	String lResponse = "";

	public Downloader(String pMessage, Timer timer) {
		lResponse = pMessage;
		timerObj = timer;
	}

	public void run() {
		counter++;
		System.out.println("Response is :: " + lResponse);
		System.out.println("counter is :: " + counter);
		if (lResponse.length() > 0) {
			timerObj.cancel();
			System.out.println("Response:" + lResponse + " <--> Timer cancel.");
		} else if (counter == 3) {
			if (functionCallTime == 1) {
				timerObj.cancel();
				System.out.println(" <--> Timer cancel.");
				callSecondFunction();
			} else {
				timerObj.cancel();
				System.out.println(" <--> Timer cancel.");
				return;
			}
			functionCallTime++;

		}

	}

	private void callSecondFunction() {
		counter = 0;
		System.out.println("Second function calling....");
		lResponse = "asdf";
		timerObj = new Timer();
		timerObj.schedule(new Downloader(lResponse, timerObj), 5000, 5000);
	}
}