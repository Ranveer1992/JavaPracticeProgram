package com.basic.comparatorAndComparable;

import java.util.Comparator;

public class CountrySortbyIdComparator implements Comparator<Country2> {

	@Override
	public int compare(Country2 o1, Country2 o2) {
		return (o1.getCountryId() < o2.getCountryId())?-1:(o1.getCountryId()>o2.getCountryId())?1:0;
	}

	
}
