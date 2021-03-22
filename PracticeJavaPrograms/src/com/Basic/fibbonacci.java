package com.Basic;
import java.util.*;
import java.math.BigInteger;
public class fibbonacci {
   public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter how much step do you want to fibbo series..");
	   int n = sc.nextInt();
	   BigInteger a = new BigInteger("0");
	   BigInteger b = new BigInteger("1");
	   System.out.print(a+" "+b+" ");
	   BigInteger sum = new BigInteger("0");
	   for(int i=0;i<n;i++){
		   sum = a.add(b);
		   a=b;
		   b=sum;
		   System.out.print(sum+" ");
	   }
   }
}
