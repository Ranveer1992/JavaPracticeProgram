package com.basic.creasional.designpattern.singleton;

public class SingletoneObject {
	private static SingletoneObject instance = new SingletoneObject();

	private SingletoneObject() {

	}

	public static SingletoneObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Display message from singletone example");
	}
}
