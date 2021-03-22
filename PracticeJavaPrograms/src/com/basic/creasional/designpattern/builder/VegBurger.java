package com.basic.creasional.designpattern.builder;

public class VegBurger extends Burger{

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 60.f;
	}

}
