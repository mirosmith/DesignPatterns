package strategy;

public class Main {

    public static void main(String[] args) {
	
	Customer simon = new Customer("Simon");
	Customer margareth = new Customer("Margareth");
	
	simon.goToPay(new CreditCardStrategy(123456), 520);
	margareth.goToPay(new PaypalStrategy("margee", "1234"), 1250);
    }

}
