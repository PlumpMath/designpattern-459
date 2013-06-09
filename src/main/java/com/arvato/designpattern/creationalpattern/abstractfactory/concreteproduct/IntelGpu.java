package com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Gpu;

public class IntelGpu implements Gpu {

	@Override
	public void render() {
		System.out.println("Intel render");
	}

}
