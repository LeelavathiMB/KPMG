package creditcard;

import creditcard.InvalidCreditCard;

public class CreditCard {

	public void checkEligiblility(int cardno) throws InvalidCreditCard{
	if(cardno<18)
		throw new InvalidCreditCard("Invalid card number");
	else
		System.out.println("Valid Credit card number");
	}
}

