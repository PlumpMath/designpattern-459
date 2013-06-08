package com.arvato.designpattern.compositepattern.decorate.concretedecorator;

import com.arvato.designpattern.compositepattern.decorate.component.Pet;
import com.arvato.designpattern.compositepattern.decorate.decorator.DecoratorPet;

public class DecoratorHappyDog extends DecoratorPet{

	
	public DecoratorHappyDog(Pet pet) {
		super(pet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shakeTails() {
		// TODO Auto-generated method stub
		feelHappy();
		super.shakeTails();
	}
	
	private void feelHappy() {
		System.out.println("Dog feels so happy!");
	}
}
