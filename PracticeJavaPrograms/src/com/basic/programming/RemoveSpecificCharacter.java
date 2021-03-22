package com.basic.programming;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveSpecificCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the string ::");
			String str = sc.nextLine();
			System.out.println("Enter what you want to remove character in given string::");
			String revstr = sc.nextLine();
			System.out.println("Before remove string :: "+str);
			String finalstr = removeSpecificChar(str,revstr);
			System.out.println("Final String is :: "+finalstr);
		} catch (Exception ex) {
			System.out.println("Exception :: " + ex);
		} finally {
			sc.close();
		}
	}

	private static String removeSpecificChar(String str, String revstr) {
		String finalstr = "";
		char []strArr = str.toLowerCase().toCharArray();
		char []revstrArr = revstr.toLowerCase().toCharArray();
		boolean []tempArr = new boolean[128];
		for(int i=0;i<revstrArr.length;i++){
			tempArr[revstrArr[i]]=true;
		}
		int k = 0;
		for(int i=0;i<strArr.length;i++){
			if(!tempArr[strArr[i]]){
				strArr[k++]=strArr[i];
			}
		}
		finalstr = new String(strArr,0,k);
		return finalstr;
	}

}
