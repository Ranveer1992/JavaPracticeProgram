package com.Basic;

import java.util.Scanner;

public class CheckFibboNumber {

	public static boolean isPerfectSquare(int num) {
		int s = (int) Math.sqrt(num);
		return (s * s == num);
	}

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number :: ");
			int n = sc.nextInt();
			boolean flag = isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);

			if (flag) {
				System.out.println("fibbo number");
			} else {
				System.out.println("Not fibbo number");
			}
		}
	}

}
