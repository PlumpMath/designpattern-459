package com.arvato.designpattern.decorator;

import org.junit.Test;

import com.arvato.designpattern.compositepattern.decorate.component.Pet;
import com.arvato.designpattern.compositepattern.decorate.concretecomponent.Dog;
import com.arvato.designpattern.compositepattern.decorate.concretedecorator.DecoratorHappyDog;
import com.arvato.designpattern.compositepattern.decorate.concretedecorator.DecoratorHungryDog;

public class TestDecoratorDog {
	
	@Test
	public void test() {
		
		//将Dog进行了两次装饰
		Pet dog = new DecoratorHappyDog(new DecoratorHungryDog(new Dog()));
		dog.shakeTails();
	}
	
	@Test
	public void test1() {
		
		//将Dog进行了一次装饰
		Pet dog = new DecoratorHungryDog(new Dog());
		dog.shakeTails();
	}
	
	@Test
	public void test2() {
		
		//未对Dog进行装饰
		Pet dog = new Dog();
		dog.shakeTails();
	}

}
