package com.ibexsys.interview.playground.sandbox;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoWireImpl {
	
	AutoWireInterface constImpl;
	
	AutoWireInterface setterImpl;
	
	
	
	
	@Autowired
	public void setterImpl(AutoWireInterface setter) {
	
		this.setterImpl = setter;
	}

}
