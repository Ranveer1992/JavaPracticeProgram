package com.Basic;

import java.util.Scanner;

public class FindPrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :: ");
		int num = sc.nextInt();
		boolean flag = false;
		if(num > 0 && num !=1){
			boolean numchk = false;
			for(int i=2;i<num/2;i++){
				if(num % i == 0){
					numchk = true;
					break;
				}
			}
			if(!numchk) {
				flag = true;
			}
		}
		if(flag){
			System.out.println("Given number is a prime");
		}else{
			System.out.println("Not a prime number");
		}
	}

}
