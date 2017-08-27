package com.example.theSpring.simpleFactory;

public class SenderFactory {

	public Sender getInstance(String name) {
		if(name == "mail") {
			return new MailSender();
		}
		if(name == "sms") {
			return new SmsSender();
		}
		return null;
	}
}
