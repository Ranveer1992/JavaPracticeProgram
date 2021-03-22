package com.Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class factorialProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int num = sc.nextInt();
		BigInteger fact = factNumber(num);
		System.out.println("Factorial "+num+" is :: "+fact);
	}

	private static BigInteger factNumber(int num) {
		BigInteger f = new BigInteger("1");
		for(int i=1;i<=num;i++){
			f = f.multiply(new BigInteger(i+""));
		}
		return f;
	}
}
