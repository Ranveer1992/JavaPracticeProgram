package com.basic.creasional.designpattern.builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float price() {
		return 160.f;
	}

}
