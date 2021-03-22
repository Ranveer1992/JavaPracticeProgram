package com.basic.interviewquestion;

public class CountBinaryString {
	public static void main(String args[]) {
	    String s="00110011"; //0011, 01, 1100, 10, 0011, 01
		//String s="10101";  // 10, 01, 10, 01
		
		int count = countBinaryForm(s);
		System.out.println("Count binary string is :: "+count);
	}

	private static int countBinaryForm(String s) {
		int res=0;
		int countZero=0;
		int countOnes=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='0') {
				if(i-1>=0 && s.charAt(i-1)=='1') {
					countZero=0;
				}
				countZero++;
				if(countZero<=countOnes) {
					res++;
				}
			}else {
				if(i-1>=0 && s.charAt(i-1)=='0') {
					countOnes=0;
				}
				countOnes++;
				if(countOnes<=countZero) {
					res++;
				}
			}
		}
		return res;
	}
}
