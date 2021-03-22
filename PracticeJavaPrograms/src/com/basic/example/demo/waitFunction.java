package com.basic.example.demo;

import java.util.Date;
import java.util.concurrent.TimeUnit;
class waitFunction{
    public static void main(String[] args) {

        try {
            String response = null;

            System.out.println("service call started " + new Date());
            // delay 5 seconds
            TimeUnit.SECONDS.sleep(10);
            System.out.println("service call started " + new Date());
            if(response==null){
            	 TimeUnit.SECONDS.sleep(80);
                //call function again
                recallService();
            }
            System.out.println("End..." + new Date());

            // delay 0.5 second
            //TimeUnit.MICROSECONDS.sleep(500);

			// delay 1 minute
            //TimeUnit.MINUTES.sleep(1);
			
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

    }
    public static void  recallService(){
        System.out.println("recalling service... after 90 sec ");
    }

}