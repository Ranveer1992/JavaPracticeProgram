package com.basic.programming;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number is ::");
			int n = sc.nextInt();
			System.out.println("Pattern programs in java : Pattern 1");
			patternPrintType1(n);
			System.out.println("Pattern programs in java : Pattern 2");
			patternPrintType2(n);
			System.out.println("Pattern programs in java : Pattern 3");
			patternPrintType3(n);
			System.out.println("Pattern programs in java : Pattern 4");
			patternPrintType4(n);
			System.out.println("Pattern programs in java : Pattern 5");
			patternPrintType5(n);
			System.out.println("Pattern programs in java : Pattern 6");
			patternPrintType6(n);
			System.out.println("Pattern programs in java : Pattern 7");
			patternPrintType7(n);
			System.out.println("Pattern programs in java : Pattern 8");
			patternPrintType8(n);
			System.out.println("Pattern programs in java : Pattern 9");
			patternPrintType9(n);
		} catch (Exception ex) {
			System.out.println("Exception : " + ex);
		} finally {
			sc.close();
		}
	}

	private static void patternPrintType1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void patternPrintType2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = n-1; i>=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	private static void patternPrintType3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	private static void patternPrintType4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	private static void patternPrintType5(int n) {
		for (int i = n; i >=1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	private static void patternPrintType6(int n) {
		for (int i = n; i >=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	private static void patternPrintType7(int n) {
		for (int i = 1; i<=n; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print(n-j + " ");
			}
			System.out.println();
		}
	}
	
	private static void patternPrintType8(int n) {
		for (int i = 1; i<=n; i++) {
			
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i-1;j>=1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	private static void patternPrintType9(int n) {
		for (int i = n; i>=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for (int i = 2; i<=n; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
