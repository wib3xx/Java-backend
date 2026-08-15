package com.collections.practice1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		CountryNames countryNames = new CountryNames();
		
		//Getting country names
		ArrayList<String> countries = countryNames.getCountryName();
		
		for(String country : countries) {
			if(country.startsWith("D")) {
				System.out.println(country);
			}
		}	
	}
}
