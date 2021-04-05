package com.basic.collection;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("ranveer");
		arrlist.add("raj");
		arrlist.add("ranveer1");
		arrlist.add("raj1");
		arrlist.add("ranveer2");
		arrlist.add("raj2");
		System.out.println(arrlist);
		for(String obj:arrlist){
			System.out.println("obj => "+obj);
		}
		
		
		String content = "This is a tutorial Website!";
		String patternString = ".*sitE.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		System.out.println("pattern ?" + pattern);
		Matcher matcher = pattern.matcher(content);
		System.out.println("matcher ?" + matcher);
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
		
	}

}
