package com.arvato.designpattern.compositepattern.bridge.concreteimplementor;

import com.arvato.designpattern.compositepattern.bridge.abstraction.People;
import com.arvato.designpattern.compositepattern.bridge.implementor.Dog;

public class Woman extends People {
	
	public Woman(Dog dog) {
		super(dog);
	}

	@Override
	public void feedDog() {
		System.out.println("Woman feeds " + dog.getClass().getName());
		dog.eatFood();
	}

}
