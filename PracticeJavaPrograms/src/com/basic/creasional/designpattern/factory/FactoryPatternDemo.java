package com.basic.creasional.designpattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShapeType("CIRCLE");
		circle.draw();
		Shape rectangle = shapeFactory.getShapeType("RECTANGLE");
		rectangle.draw();
		Shape square = shapeFactory.getShapeType("SQUARE");
		square.draw();
	}

}
