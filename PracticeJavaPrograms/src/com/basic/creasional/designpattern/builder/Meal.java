package com.basic.creasional.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
  private List<Item> items = new ArrayList<Item>();
  public void addItem(Item item) {
	  items.add(item);
  }
  public float getCost() {
	  float cost = 0.0f;
	  for(Item item:items) {
		  cost = cost + item.price();
	  }
	  return cost;
  }
  public void showItem() {
	  for(Item item:items) {
		  System.out.println("Item : "+item.name());
		  System.out.println("Paking : "+item.packing().pack());
		  System.out.println("Price : "+item.price());
		  System.out.println();
	  }
  }
}
