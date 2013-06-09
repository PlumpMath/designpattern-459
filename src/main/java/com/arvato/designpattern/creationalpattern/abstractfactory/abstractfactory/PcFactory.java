package com.arvato.designpattern.creationalpattern.abstractfactory.abstractfactory;

import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Cpu;
import com.arvato.designpattern.creationalpattern.abstractfactory.abstractporduct.Gpu;

/**
 * 
 * Pc工厂 ，用以产生cpu和gpu对象
 *
 * @author Jerry
 *
 * @version 2013-6-9
 *
 */
public interface PcFactory {

	Cpu createCpu();
	
	Gpu createGpu();
}
