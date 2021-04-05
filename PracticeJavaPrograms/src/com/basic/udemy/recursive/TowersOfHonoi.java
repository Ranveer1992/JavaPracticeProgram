package com.basic.udemy.recursive;

public class TowersOfHonoi {
	static void solve(int disk, char source, char middle,char destination) {
		if(disk==0) {
			System.out.println("Plate "+disk+" from "+source+" to "+destination);
			return;
		}
		//we move n-1 plates to the middle rod - to be able to move largest
		//to the destination last rod
		solve(disk-1,source,destination,middle);
		//we moved the largest rod to the destination
		//we call this method recursively this is not the always largest
		System.out.println("Plate "+disk+" from "+source+" to "+destination);
		//we move plates from middle to destination (with the help of first rod)
		solve(disk-1,middle,source,destination);
		
	}
}
