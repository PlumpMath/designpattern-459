package com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Cpu;

public class AmdCpu implements Cpu {

	@Override
	public void calculate() {
		System.out.println("AMD calculates");
	}

}
