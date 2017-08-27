package com.example.theSpring.staticFactory;

public class TestFactory {

	public static void main(String[] args) {
		Sender sender = SenderFactory.getMailInstance();
		sender.send();
		
		
		Sender sender2 = SenderFactory.getSmsInstance();
		sender2.send();
	}
}
