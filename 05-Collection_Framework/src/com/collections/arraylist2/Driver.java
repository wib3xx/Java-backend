package com.collections.arraylist2;

import java.util.ArrayList;

/**
 * @author Sarvagay2
 */
public class Driver {

	public static void main(String[] args) {
		CityService cityService = new CityService();
		
		//Getting city names
		ArrayList<String>cities = cityService.getCityNames();
		
		//Process them, Task- Find the cities starting with J
		
		for(String city : cities) {
			if(city.startsWith("J")) {
				System.out.println(city);
			}
		}
	}
}
