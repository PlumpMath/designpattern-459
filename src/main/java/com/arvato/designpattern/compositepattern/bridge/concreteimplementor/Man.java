package com.arvato.designpattern.compositepattern.bridge.concreteimplementor;

import com.arvato.designpattern.compositepattern.bridge.abstraction.People;
import com.arvato.designpattern.compositepattern.bridge.implementor.Dog;

public class Man extends People {

	public Man(Dog dog) {
		super(dog);
		
	}

	@Override
	public void feedDog() {
		System.out.println("Man feeds " +  dog.getClass().getName());
		dog.eatFood();
	}

}
