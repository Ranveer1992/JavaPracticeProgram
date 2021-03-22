package com.basic.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Country2 indiaCountry = new Country2(1, "India");
		Country2 chinaCountry = new Country2(3, "USA");
		Country2 nepalCountry = new Country2(4, "Russia");
		Country2 bhutanCountry = new Country2(2, "Japan");

		List<Country2> listOfCountries = new ArrayList<Country2>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);

		System.out.println("Before Sort by id : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country2 country = (Country2) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "||" + "Country name: " + country.getCountryName());
		}

		Collections.sort(listOfCountries, new CountrySortbyIdComparator());

		System.out.println("After Sort by id: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country2 country = (Country2) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}

		// Sort by countryName
		Collections.sort(listOfCountries, new Comparator<Country2>() {
			@Override
			public int compare(Country2 o1, Country2 o2) {
				return o1.getCountryName().compareTo(o2.getCountryName());
			}
		});

		System.out.println("After Sort by name: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country2 country = (Country2) listOfCountries.get(i);
			System.out.println(
					"Country Id: " + country.getCountryId() + "|| " + "Country name: " + country.getCountryName());
		}
	}

}
