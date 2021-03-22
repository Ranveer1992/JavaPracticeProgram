package com.Basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class datetimezone {

	static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	static boolean isValidDate(String input) {
		boolean lstatus = false;
		 if (input != null && !input.matches("\\d{4}-[01]\\d-[0-3]\\d"))
		        return lstatus;
	     try {
	          Date d = format.parse(input);
	          System.out.println(d);
	          lstatus = true;
	     }
	     catch(ParseException e){
	    	 lstatus = false;
	     }
	     return lstatus;
	}
	
	public static void main(String[] args) {
		
		String d = "2019-13-30";
		
		boolean ch = isValidDate(d);
		
        System.out.println(ch);
	}

}
