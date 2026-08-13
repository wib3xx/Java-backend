package com.collections.practice;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		CityService cityService = new CityService();
		
		ArrayList<String> cities = cityService.getCityNames();
		
		for(String city : cities) {
			if(city.startsWith("D")) {
				System.out.println(city);
			}
		}
	}
}
