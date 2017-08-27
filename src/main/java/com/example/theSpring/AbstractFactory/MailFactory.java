package com.example.theSpring.AbstractFactory;

public class MailFactory implements SenderFactory{

	@Override
	public Sender getInstance() {
		// TODO Auto-generated method stub
		return new MailSender();
	}
	
	public static Sender getStaticInstance() {
		return new MailSender();
	}

}
