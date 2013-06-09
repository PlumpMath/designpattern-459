package com.arvato.designpattern.creationalpattern.factorymethod.concreteproduct;

import com.arvato.designpattern.creationalpattern.factorymethod.product.MobilePhone;

public class Iphone implements MobilePhone {

	@Override
	public void dial() {
		System.out.println("Iphone dial number with siri!");
	}

}
