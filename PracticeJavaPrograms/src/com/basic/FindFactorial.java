package com.basic;
import java.util.*;

import javax.tools.JavaFileObject;

import java.math.BigInteger;
public class FindFactorial {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number::");
		long n = sc.nextInt();
		BigInteger f = new BigInteger("1");
		for(long i=n;i>=1;i--){
			f=f.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of "+n+ " is :: "+f);
		System.out.println("Factorial of "+n+ " Length is :: "+f.toString().length());
	}

}
