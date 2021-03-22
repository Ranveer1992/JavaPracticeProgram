package com.Basic;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class ReverseInputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String demo="2018-11-10T00:00:00.000";
		String date1 = "21/02/2019";
		String string = "2018-04-10T04:00:00.000Z";
		
		String sDate1="21/02/2019";  
	    java.util.Date siStartDate = null;
		try {
			siStartDate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
			String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date = simpleDateFormat.format(siStartDate);
			System.out.println("Pattern=>"+date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    System.out.println("sadkjfklasjdf=>"+sDate1+"\t"+siStartDate.toString());  
	    
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(date1, formatter);
		System.out.println("Date=>"+date);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Number:");
		long num = sc.nextLong();
		long temp = num;
		long rev = 0;
		long rem = 0;
		while(num > 0){
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("Original Number is : "+temp+" and \nReverse Number is :"+rev);
	}

}
