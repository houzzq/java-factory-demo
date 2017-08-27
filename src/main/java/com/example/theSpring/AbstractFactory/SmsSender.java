package com.example.theSpring.AbstractFactory;

public class SmsSender  implements Sender{

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("from sms sender");
	}

}
