package com.app.model;

import com.app.Account;
import com.app.Card;

public class SavingAccount implements Account {

	private Card card;
	
	public SavingAccount(Card card) {
		this.card = card;
	}
	@Override
	public String createAccount(){
		return "Saving Account created successfuly.";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return card.cardDetails();
	}
}
