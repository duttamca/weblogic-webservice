package com.skd.service;

import javax.jws.WebService;

@WebService
public class CalculatorService implements Calculator {

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	@Override
	public int sub(int i, int j) {
		return i - j;
	}


}
