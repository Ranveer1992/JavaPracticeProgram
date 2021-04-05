package com.basic;

import java.util.*;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		boolean flag = true;
		System.out.println("SquareRoot of " + num + " is : " + Math.sqrt(num));
		if (num <= 0) {
            System.out.println("Not possible");
		} else if (num == 1 || num == 2) {
			System.out.println("This is a primenumber");
		} else {
			for (int i = 2; i < Math.sqrt(num); i++) {
				if(num % i == 0){
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("This is a primenumber");
			}else{
				System.out.println("This is not a primenumber");
			}
		}
	}

}
