package com.basic.creasional.designpattern.abstractfactory;

public class ColorFactory extends AbstractFactory{

	
	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

}
