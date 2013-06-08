package com.arvato.designpattern.compositepattern.adapter.client;

import com.arvato.designpattern.compositepattern.adapter.adaptee.Labrador;
import com.arvato.designpattern.compositepattern.adapter.adapter.TrainingGuideDog;
import com.arvato.designpattern.compositepattern.adapter.target.GuideDog;

public class BlindPeople {
	
	public void getGuideDog() {
		
		//使用适配器将Dog接口适配成GuideDog接口
		GuideDog guideDog = new TrainingGuideDog(new Labrador());
		guideDog.leadTheWay();
		
	}
	

}
