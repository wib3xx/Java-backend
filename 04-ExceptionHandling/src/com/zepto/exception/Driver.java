package com.zepto.exception;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.createUser("Sarvagay", "123@123");
	}
	
	public void createUser(String userName, String password) {
		System.out.println("UserInfo START");
		
		String userId = userName.substring(0, 5)+ "123";
		
		System.out.println("UserInfo starts And User Id is generated: "+ userId + " Ends");
	}
}
