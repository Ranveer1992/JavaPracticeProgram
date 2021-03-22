package com.basic.creasional.designpattern.builder;

public abstract class Burger implements Item {
	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		return new Bottel();
	}
}
