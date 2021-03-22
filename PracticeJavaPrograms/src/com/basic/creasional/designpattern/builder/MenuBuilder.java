package com.basic.creasional.designpattern.builder;

public class MenuBuilder {

	public Meal prepairedVeg() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	public Meal prepairedNonVeg() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
}
