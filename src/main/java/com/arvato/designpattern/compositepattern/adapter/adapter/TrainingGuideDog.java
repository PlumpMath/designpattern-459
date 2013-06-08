package com.arvato.designpattern.compositepattern.adapter.adapter;

import com.arvato.designpattern.compositepattern.adapter.adaptee.Dog;
import com.arvato.designpattern.compositepattern.adapter.target.GuideDog;

/**
 * 
 * 适配器，将Dog对象适配成GuideDog
 *
 * @author Jerry
 *
 * @version 2013-6-7
 *
 */
public class TrainingGuideDog implements GuideDog{
	
	//持有一个对Dog对象的引用
	private Dog dog;
	

	public TrainingGuideDog(Dog dog) {
		this.dog = dog;
	}

	@Override
	public void leadTheWay() {
		// TODO Auto-generated method stub
		System.out.println("GuideDog leads the way");
		dog.eatBones();
	}
	
	
	

}
