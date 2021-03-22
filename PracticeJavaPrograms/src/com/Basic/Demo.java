package com.Basic;

public class Demo {

	static public  void main(String[] args)  {
		int val = checkException();
		System.out.println("val => "+val);
	}

	static private int checkException() {
		int a=0;
		try{
			a=40;
			System.out.println("Value is :: "+a/0);
		} 
		catch(Exception ex){
			System.out.println(ex);
			a=100;
			return a;
		}
		return 60;
	}

}
