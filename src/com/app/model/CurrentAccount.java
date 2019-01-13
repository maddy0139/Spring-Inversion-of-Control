package com.app.model;

import com.app.Account;
import com.app.Card;

public class CurrentAccount implements Account {

	private Card card;
	/*public  CurrentAccount(Card card) {
		this.card = card;
	}*/
	
	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String createAccount() {
		// TODO Auto-generated method stub
		return "Current Account Created Successfully.";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return card.cardDetails();
	}

}
