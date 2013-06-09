package com.arvato.designpattern.factorymethod;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.arvato.designpattern.creationalpattern.factorymethod.concretecreator.GalaxyFactory;
import com.arvato.designpattern.creationalpattern.factorymethod.concretecreator.IphoneFactory;
import com.arvato.designpattern.creationalpattern.factorymethod.creator.MobilePhoneFactory;

public class TestMobileFactory {

	@Test
	public void test() {
		List<MobilePhoneFactory> list = new ArrayList<MobilePhoneFactory>();
		list.add(new IphoneFactory());
		list.add(new GalaxyFactory());
		
		for(MobilePhoneFactory mobileFactory : list) {
			mobileFactory.getMobilePhone().dial();
		}
	}
}
