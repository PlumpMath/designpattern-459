package com.arvato.designpattern.abstractfactory;

import org.junit.Test;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractfactory.PcFactory;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Cpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Gpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.concretefactory.AmdPcFactory;
import com.arvato.designpattern.creationalpattern.abstractfactory.concretefactory.IntelPcFactory;

public class TestPcFactory {

	@Test
	public void test() {
		PcFactory intelPcFactory = new IntelPcFactory();
		PcFactory amdPcFactory = new AmdPcFactory();
		Cpu intelCpu = intelPcFactory.createCpu();
		Cpu amdCpu = amdPcFactory.createCpu();
		Gpu intelGpu = intelPcFactory.createGpu();
		Gpu amdGpu = amdPcFactory.createGpu();
		
		intelCpu.calculate();
		amdCpu.calculate();
		intelGpu.render();
		amdGpu.render();
		
	}
}
