package com.interfaces.functional.youtube.subscription.sys;

import java.util.function.Predicate;

public class Driver {

	public static void main(String[] args) {
		Predicate<Integer> memberStatus = (status) -> status > 180;
		System.out.println(memberStatus.test(200));
		
		
	}
}
