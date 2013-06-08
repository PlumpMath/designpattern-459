package com.arvato.designpattern.compositepattern.decorate.concretedecorator;

import com.arvato.designpattern.compositepattern.decorate.component.Pet;
import com.arvato.designpattern.compositepattern.decorate.decorator.DecoratorPet;

public class DecoratorHungryDog extends DecoratorPet{

	
	public DecoratorHungryDog(Pet pet) {
		super(pet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shakeTails() {
		// TODO Auto-generated method stub
		eatBones();
		super.shakeTails();
	}
	
	private void eatBones() {
		System.out.println("Dog ate several bones!");
	}

}
