package com.arvato.designpattern.creationalpattern.abstractfactory.concretefactory;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractfactory.PcFactory;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Cpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Gpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct.IntelCpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.concreteproduct.IntelGpu;

public class IntelPcFactory implements PcFactory {

	@Override
	public Cpu createCpu() {
		return new IntelCpu();
	}

	@Override
	public Gpu createGpu() {
		return new IntelGpu();
	}

}
