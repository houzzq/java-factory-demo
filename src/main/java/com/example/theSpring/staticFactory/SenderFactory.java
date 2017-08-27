package com.example.theSpring.staticFactory;

public class SenderFactory {

	public static Sender getMailInstance() {
		return new MailSender();
	}
	
	public static Sender getSmsInstance() {
		return new SmsSender();
	}
}
