package com.zepto.user;
/**
 * @author Sarvagay
 * **/
public class User {

	public void createUser(String userName, String password) {
		System.out.println("UserInfo START");
		String userId = null;
		int balance = 50/0;
		
		
		try {
		
		 userId = userName.substring(0, 5)+ "123";
		 } 
		catch(NullPointerException e) {
			System.out.println("User Id cannot be generated");
			e.getStackTrace();
		}
		catch(ArithmeticException e) {
			System.out.println("50/0 is undefined");
			e.getStackTrace();
		}
		catch(Exception e) {
			System.out.println("Unknown Error");
			e.getStackTrace();
			
		}
		
		System.out.println("UserInfo starts And User Id is generated: "+ userId + " Ends");
	}
}
