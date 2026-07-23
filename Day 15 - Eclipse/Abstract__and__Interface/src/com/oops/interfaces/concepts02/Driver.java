package com.oops.interfaces.concepts02;

public class Driver {

	public static void main(String[] args) {
		PersonalBanking personalBanking = new PersonalBanking();
			 personalBanking.transfer();
			 personalBanking.recieve();
			 personalBanking.processing();             
			 personalBanking.suspend();
			 personalBanking.cancel();
			 	System.out.println();
		 
		 CorpoprateBanking corporateBanking = new CorpoprateBanking();
			 corporateBanking.transfer();
			 corporateBanking.recieve();
			 corporateBanking.processing();             
			 corporateBanking.suspend();
			 corporateBanking.cancel();
	}
}
