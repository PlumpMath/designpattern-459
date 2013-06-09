package com.arvato.designpattern.creationalpattern.factorymethod.concretecreator;

import com.arvato.designpattern.creationalpattern.factorymethod.concreteproduct.Galaxy;
import com.arvato.designpattern.creationalpattern.factorymethod.creator.MobilePhoneFactory;
import com.arvato.designpattern.creationalpattern.factorymethod.product.MobilePhone;

public class GalaxyFactory implements MobilePhoneFactory {

	@Override
	public MobilePhone getMobilePhone() {
		return new Galaxy();
	}

}
