package com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Cpu;

public class IntelCpu implements Cpu {

	@Override
	public void calculate() {
		System.out.println("Intel calculate");
	}

}
