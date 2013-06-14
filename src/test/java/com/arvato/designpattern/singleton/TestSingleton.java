package com.arvato.designpattern.singleton;

import org.junit.Test;

import com.arvato.designpattern.creationalpattern.singleton.FullSingleton;
import com.arvato.designpattern.creationalpattern.singleton.HungrySingleton;

public class TestSingleton {

	@Test
	public void testHungry() {
		HungrySingleton hungryInstance1 = HungrySingleton.getInstance();
		HungrySingleton hungryInstance2 = HungrySingleton.getInstance();
		System.out.println(hungryInstance1);
		System.out.println(hungryInstance2);
		System.out.println(hungryInstance1 == hungryInstance2);
	}
	
	@Test
	public void testFull() {
		FullSingleton fullInstance1 = FullSingleton.getInstance();
		FullSingleton fullInstance2 = FullSingleton.getInstance();
		System.out.println(fullInstance1);
		System.out.println(fullInstance2);
		System.out.println(fullInstance1 == fullInstance2);
		
	}
}
