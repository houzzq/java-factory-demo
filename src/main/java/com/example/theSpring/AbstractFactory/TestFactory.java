package com.example.theSpring.AbstractFactory;

public class TestFactory {

	public static void main(String[] args) {
		SenderFactory factory = new MailFactory();
		Sender sender = factory.getInstance();
		sender.send();
		
		
		Sender sender2 = SmsFactory.getInstanceByStatic();
		sender2.send();
	}
}
