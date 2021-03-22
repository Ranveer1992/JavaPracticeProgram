package com.basic.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthByNames {
	public static void main(String args[]) {
		// List of objects of Author class
		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("Henry", "Miller", 22));
		al.add(new Author("Nalo", "Hopkinson", 43));
		al.add(new Author("Frank", "Miller", 44));
		al.add(new Author("Deborah", "Hopkinson", 54));
		al.add(new Author("George R. R.", "Martin", 24));

		/*
		 * Sorting the list using Collections.sort() method, we can use this method
		 * because we have implemented the Comparable interface in our user defined
		 * class Author
		 */
		Collections.sort(al);
		for (Author str : al) {
			System.out.println("FistName: "+str.firstName + "\n" +"BookName: "+ str.bookName + "\n" + "AuthAge: " + str.auAge+"\n");
		}
	}
}