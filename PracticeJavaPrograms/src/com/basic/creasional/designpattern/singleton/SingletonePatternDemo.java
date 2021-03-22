package com.basic.creasional.designpattern.singleton;

public class SingletonePatternDemo {
	public static void main(String args[]) {
		//SingletoneObject object1 = new SingletoneObject();
		SingletoneObject object2 = SingletoneObject.getInstance();
		object2.showMessage();
	}
}
