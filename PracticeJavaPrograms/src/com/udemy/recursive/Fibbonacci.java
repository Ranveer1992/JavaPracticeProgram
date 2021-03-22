package com.udemy.recursive;

public class Fibbonacci {
	
   static int headFibbo(int n) {
	   //base condition
	   if(n==0) return 0;
	   if(n==1) return 1;
	   //recursive call
	   int fibo1 = headFibbo(n-1);
	   int fibo2 = headFibbo(n-2);
	   //execution
	   int res = fibo1+fibo2;
	   return res;
   }
   
   static int tailFibbo(int n,int a, int b) {
	   if(n==0) return a;
	   if(n==1) return b;
	   int res = tailFibbo(n-1,b,a+b);
	   return res;
   }
}
