package com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Gpu;

public class AmdGpu implements Gpu {

	@Override
	public void render() {
		System.out.println("AMD render");
	}

}
