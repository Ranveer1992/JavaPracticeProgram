package com.basic.example.demo;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

class Helper {

	public static void main(String[] args) {
		
		try {
			System.out.println("First Time Function Calling....................");
			String res = "dsfasf";
			Timer timer = new Timer();
			timer.schedule(new Downloader(res, timer), 5000, 5000);
		} catch (Exception e) {
			System.out.println("InterruptedException Exception" + e.getMessage());
		}
	}
}
