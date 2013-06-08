package com.arvato.designpattern.compositepattern.decorate.decorator;

import com.arvato.designpattern.compositepattern.decorate.component.Pet;

public abstract class DecoratorPet implements Pet {
	
	protected Pet pet;
	
	public DecoratorPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public void shakeTails() {
		// TODO Auto-generated method stub
		pet.shakeTails();
	}

}
