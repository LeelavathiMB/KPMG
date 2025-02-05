package creditcard;

import creditcard.CreditCard;
import creditcard.InvalidCreditCard;
import creditcard.Sample;

public class Test {
	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.method1();
		try {
			obj.method1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		CreditCard ee= new CreditCard();
		try {
			ee.checkEligiblility(23);
		}
		catch (InvalidCreditCard e) {
			System.out.println(e.getMessage());
		}
	}


}
