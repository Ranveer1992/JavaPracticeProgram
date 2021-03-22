package com.Basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String is :: ");
		String str = sc.nextLine();
	    System.out.println("String is :: "+str);
	    String reverseStr = findReverseUsingArray(str);
	    System.out.println("findReverseUsingArray String is :: "+reverseStr);
	    String reverseStr1 = findReverseUsingBuilder(str);
	    System.out.println("findReverseUsingBuilder String is :: "+reverseStr1);
	}

	private static String findReverseUsingBuilder(String str) {
		StringBuilder input = new StringBuilder();
		input.append(str);
		input = input.reverse();
		return input.toString();
	}

	private static String findReverseUsingArray(String str) {
		String rev = "";
		char [] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--){
			rev += ch[i];
		}
		return rev;
	}

}
