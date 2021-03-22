package com.basic.example.demo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Program to measure elapsed time in Java
class TimeUtil {
	
	static List<?> response = new ArrayList<String>();;// for example
	static boolean responseFlag = false; //your decision whether response came or not
	
	public static void main(String[] args) throws InterruptedException {

	
		String req = "";
		String bckReq = req;

		Instant start = Instant.now();
		/* ... the code being measured starts ... */
		Thread attempt1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("hit middleware with req :: " + req);
				if (responseFlag) {
					response = Arrays.asList("status", "200");
					System.out.println("middleware hit successfully :) response.size " + response.size());
				} else {
					System.out.println("middleware hit failed :( response.size " + response.size());
				}

			}
		});
		if (!response.isEmpty() && response.size() > 2) {
			System.out.println("middleware hit successfully :) " + response);
			return;
		}
		
		attempt1.start();//attempt first 
		
		if(responseFlag) {
			return;
		}
		// sleep for 90 seconds
		TimeUnit.SECONDS.sleep(90);

		/* ... the code being measured ends ... */

		Instant end = Instant.now();

		Duration interval = Duration.between(start, end);

		if (interval.getSeconds() > 90 || interval.getSeconds() == 90) {
			
			System.out.println("hitting middleware again !! ");
			
			Thread attempt2 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("hit middleware with bckReq :: " + bckReq);
					if (responseFlag) {
						response = Arrays.asList("status", "200");
						System.out.println("middleware hit successfully :) response.size " + response.size());
						responseFlag = false;
					} else {
						System.out.println("middleware hit failed :( response.size " + response.size());
					}

				}
			});
			
			attempt2.start();//attempt again
			
			if(!responseFlag) {
				System.out.println("Execution time in seconds: " + interval.getSeconds());
				return;
			}
		}
		

		// System.out.println("Execution time in seconds: " +interval.get(SECONDS));
	}
}