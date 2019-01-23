package com.china.terry.model;

public class Singleton {
	private static Singleton singloten;
	private Singleton(){}
	private static synchronized Singleton getInstance(){
		if(singloten == null){
			return new Singleton();
		}
		return singloten;
	}

}
