package com.example.theSpring.AbstractFactory;

public class SmsFactory implements SenderFactory{

	@Override
	public Sender getInstance() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}
	
	public static Sender getInstanceByStatic() {
		return new SmsSender();
	}

}
