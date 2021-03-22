package com.basic.creasional.designpattern.prototype;

import java.util.Hashtable;

public class ShapeCache {

	
	private static Hashtable<String , Shape>shapMap = new Hashtable<>();
	public static Shape getShape(String shapeId) {
		Shape shapeType = shapMap.get(shapeId);
		return (Shape) shapeType.clone();
	}
	public static void loadShape() {
		Circle circle = new Circle();
		circle.setId("1");
		shapMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapMap.put(rectangle.getId(), rectangle);
	}

}
