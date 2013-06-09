package com.arvato.designpattern.creationalpattern.factorymethod.concretecreator;

import com.arvato.designpattern.creationalpattern.factorymethod.concreteproduct.Iphone;
import com.arvato.designpattern.creationalpattern.factorymethod.creator.MobilePhoneFactory;
import com.arvato.designpattern.creationalpattern.factorymethod.product.MobilePhone;

public class IphoneFactory implements MobilePhoneFactory {

	@Override
	public MobilePhone getMobilePhone() {
		return new Iphone();
	}

}
