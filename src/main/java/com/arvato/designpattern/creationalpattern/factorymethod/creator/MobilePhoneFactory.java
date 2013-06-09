package com.arvato.designpattern.creationalpattern.factorymethod.creator;

import com.arvato.designpattern.creationalpattern.factorymethod.product.MobilePhone;

/**
 * 
 * 定义工厂接口，用于产生MobilePhone类型的对象
 *
 * @author Jerry
 *
 * @version 2013-6-9
 *
 */
public interface MobilePhoneFactory {
	
	MobilePhone getMobilePhone();
}
