package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {

	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Account account = context.getBean("myCreditAccount",Account.class);
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		context.close();
	}
}
