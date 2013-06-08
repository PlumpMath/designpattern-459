package com.arvato.designpattern.adapter;

import org.junit.Test;

import com.arvato.designpattern.compositepattern.adapter.client.BlindPeople;

public class TestBlindPeople {

	@Test
	public void test() {
		BlindPeople bp = new BlindPeople();
		bp.getGuideDog();
	}
}
