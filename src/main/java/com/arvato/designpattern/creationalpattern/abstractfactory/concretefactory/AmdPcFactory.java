package com.arvato.designpattern.creationalpattern.abstractfactory.concretefactory;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractfactory.PcFactory;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Cpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Gpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct.AmdCpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct.AmdGpu;

public class AmdPcFactory implements PcFactory {

	@Override
	public Cpu createCpu() {
		return new AmdCpu();
	}

	@Override
	public Gpu createGpu() {
		return new AmdGpu();
	}

}
