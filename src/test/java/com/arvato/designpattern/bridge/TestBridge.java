package com.arvato.designpattern.bridge;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.arvato.designpattern.compositepattern.bridge.abstraction.People;
import com.arvato.designpattern.compositepattern.bridge.concreteimplementor.Man;
import com.arvato.designpattern.compositepattern.bridge.concreteimplementor.Woman;
import com.arvato.designpattern.compositepattern.bridge.refinedabstraction.Husky;
import com.arvato.designpattern.compositepattern.bridge.refinedabstraction.Labrador;

public class TestBridge {
	
	@Test
	public void test() {
		List<People> list = new ArrayList<People>();
		list.add(new Man(new Labrador()));
		list.add(new Man(new Husky()));
		list.add(new Woman(new Labrador()));
		list.add(new Woman(new Husky()));
		
		for (People people : list) {
			people.feedDog();
		}
		
		
	}

}
