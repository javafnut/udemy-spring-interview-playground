package com.ibexsys.interview.playground.sandbox;


import org.springframework.stereotype.Component;

@Component
public class AutowireConstuctor implements AutoWireInterface {

    private String message;
    
	public AutowireConstuctor(String msg) {
		this.setMessage(msg);
	}

	@Override
	public void setMessage(String msg) {
		this.message = msg;

	}

	@Override
	public String getMessage(){
		return this.message;
	}

}
