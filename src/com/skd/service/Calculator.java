package com.skd.service;

import javax.jws.WebService;

@WebService
public interface Calculator {
	
	public int add(int i, int j);
	public int sub(int i, int j);

}
