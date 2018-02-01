package strategy;

public class CreditCardStrategy implements Strategy {    
   
    private int cardNumber;
    
    public CreditCardStrategy(int cardNumber) {		
	this.setCardNumber(cardNumber);
    }

    @Override
    public String pay(int howMuch) {
	
	return "paid with Credit card " + howMuch + " $.";
    }

    public int getCardNumber() {
	return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
	this.cardNumber = cardNumber;
    }

}
