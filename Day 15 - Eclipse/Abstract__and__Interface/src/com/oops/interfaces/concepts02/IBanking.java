package com.oops.interfaces.concepts02;

public interface  IBanking {

	public static final int MAX = 100;
	
	public void transfer();
	public void recieve();
	public void processing();             //All are Public & abstract methods 
	public void suspend();
	void cancel();
}
