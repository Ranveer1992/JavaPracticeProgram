package com.basic.programming;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number is ::");
			int num = sc.nextInt();
			if(num<0){
				System.out.println("Please enter valid value");
			}else{
				factorialValue(num);
			}
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		} finally {
			sc.close();
		}
	}

	private static void factorialValue(int num) {
		BigInteger fact = new BigInteger("1");
		for(int i=num;i>=1;i--){
			fact = BigInteger.valueOf(i).multiply(fact);
		}
		System.out.println("Length of factorial digit to given number is:: "+fact.toString().length());
		System.out.println("Factorial "+num+ " is :: "+fact);
	}

}
