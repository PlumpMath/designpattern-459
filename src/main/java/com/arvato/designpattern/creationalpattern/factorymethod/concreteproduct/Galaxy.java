package com.arvato.designpattern.creationalpattern.factorymethod.concreteproduct;

import com.arvato.designpattern.creationalpattern.factorymethod.product.MobilePhone;

public class Galaxy implements MobilePhone {

	@Override
	public void dial() {
		System.out.println("Galaxy dail number in ordinary way!");
	}

}
