package com.basic.creasional.designpattern.prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadShape();
		
		Shape cloneshape1 = (Shape)ShapeCache.getShape("1");
		System.out.println("Shape :: "+cloneshape1.getType());
		
		Shape cloneshape2 = (Shape)ShapeCache.getShape("2");
		System.out.println("Shape :: "+cloneshape2.getType());
		
		Shape cloneshape3 = (Shape)ShapeCache.getShape("3");
		System.out.println("Shape :: "+cloneshape3.getType());
	}

}
