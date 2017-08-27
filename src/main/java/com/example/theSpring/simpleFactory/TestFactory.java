package com.example.theSpring.simpleFactory;

public class TestFactory {

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.getInstance("sms");
		sender.send();
	}
}
