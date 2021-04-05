package com.basic;

import java.util.Scanner;

public class FindArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 For Area Of Circle :: ");
		System.out.println("Enter 2 For Area Of Tringle :: ");
		System.out.println("Enter 3 For Area Of Rectangle :: ");
		while (true) {
			System.out.println("Enter choice what you want :: ");
			int ch = sc.nextInt();
			String area;
			switch (ch) {
			case 1:
				area = findAreaOfCircle();
				System.out.println("Area of circle is :: " + area);
				break;
			case 2:
				area = findAreaOfTringle();
				System.out.println("Area of Tringle is :: " + area);
				break;
			case 3:
				area = findAreaOfRectangle();
				System.out.println("Area of Rectangle is :: " + area);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
		}
	}

	private static String findAreaOfRectangle() {
		String res;
		double w;
		double h;
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter width is :: ");
			w = sc.nextDouble();
			System.out.println("Enter height is :: ");
			h = sc.nextDouble();
			res = Double.toString((w * h));
		} catch (Exception e) {
			res = e.toString();
		}
		return res;
	}

	private static String findAreaOfTringle() {
		String res;
		double w;
		double h;
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter width is :: ");
			w = sc.nextDouble();
			System.out.println("Enter height is :: ");
			h = sc.nextDouble();
			res = Double.toString((w * h) / 2);
		} catch (Exception e) {
			res = e.toString();
		}
		return res;
	}

	private static String findAreaOfCircle() {
		String res;
		double r;
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter radius is ::");
			r = sc.nextDouble();
			res = Double.toString((r * r) * (22 / 7));
		} catch (Exception e) {
			res = e.toString();
		}
		return res;
	}

}
