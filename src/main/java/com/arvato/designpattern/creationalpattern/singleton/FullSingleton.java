package com.arvato.designpattern.creationalpattern.singleton;

public class FullSingleton {

private static FullSingleton instance = new FullSingleton();
	
	private FullSingleton(){
		
	}
	
	public static synchronized FullSingleton getInstance() {
		return instance;
	}
}
