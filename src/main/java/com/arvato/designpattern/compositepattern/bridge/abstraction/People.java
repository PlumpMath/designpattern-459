package com.arvato.designpattern.compositepattern.bridge.abstraction;

import com.arvato.designpattern.compositepattern.bridge.implementor.Dog;

/**
 * 
 * 定义People的抽象类，持有一个Dog的引用
 *
 * @author Jerry
 *
 * @version 2013-6-8
 *
 */
public abstract class People {
	
	protected Dog dog;
	
	public People(Dog dog) {
		this.dog = dog;
	}

	public abstract void feedDog();

}
