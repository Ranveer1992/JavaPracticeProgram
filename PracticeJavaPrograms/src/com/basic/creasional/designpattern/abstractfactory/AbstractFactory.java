package com.basic.creasional.designpattern.abstractfactory;

public abstract class AbstractFactory {
   abstract Shape getShape(String shapeType);
   abstract Color getColor(String colorType);
}
