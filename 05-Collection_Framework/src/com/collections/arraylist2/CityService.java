package com.collections.arraylist2;

import java.util.ArrayList;

/**
 * @author sarva
 */
public class CityService {

	public ArrayList<String> getCityNames(){
		
		ArrayList<String> cities = new ArrayList();
		cities.add("Banglore");
		cities.add("Jharkhand");
		cities.add("Jodhpur");
		cities.add("Jamshedpur");
		cities.add("Jammu");
		cities.add("New Delhi");
		cities.add("Gujarat");
		return cities;
	}
}
