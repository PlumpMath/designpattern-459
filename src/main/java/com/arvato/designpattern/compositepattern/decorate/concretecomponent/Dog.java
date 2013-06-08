package com.arvato.designpattern.compositepattern.decorate.concretecomponent;

import com.arvato.designpattern.compositepattern.decorate.component.Pet;

public class Dog implements Pet {

	@Override
	public void shakeTails() {
		// TODO Auto-generated method stub
		System.out.println("Dogs shake their tails!");
	}

}
