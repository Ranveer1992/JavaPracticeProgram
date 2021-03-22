package com.basic.creasional.designpattern.builder;

public class BuilderPatternDemo {
	public static void main(String args[]) {
		MenuBuilder menuBuilder = new MenuBuilder();
		Meal vegMeal = menuBuilder.prepairedVeg();
		System.out.println("Veg Meal");
		vegMeal.showItem();
		System.out.println("Total Cost :: "+vegMeal.getCost());
		
		Meal nonVegMeal =  menuBuilder.prepairedNonVeg();
		System.out.println("Non Veg Meal");
		nonVegMeal.showItem();
		System.out.println("Total Cost :: "+nonVegMeal.getCost());
	}
}
