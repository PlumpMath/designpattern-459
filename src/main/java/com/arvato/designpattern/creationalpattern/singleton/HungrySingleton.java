package com.arvato.designpattern.creationalpattern.singleton;

public class HungrySingleton {
	
	private static HungrySingleton instance = null;
	
	private HungrySingleton(){
		
	}
	
	public static synchronized HungrySingleton getInstance() {
		if (instance == null) {
			instance = new HungrySingleton();
		}
		return instance;
	}

}
