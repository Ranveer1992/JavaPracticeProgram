package com.basic.udemy.recursive;

public class Factorial {
	
    public static int head(int n) {
    	//base condition
		if(n==1) return 1;
		//recursive call
		int f = head(n-1);
		//execution
		int res = n*f;
		return res;
	}
    
    public static int tail(int n, int f) {
    	if(n==1) return f;
    	int res = tail(n-1,n*f);
    	return res;
    }
}
