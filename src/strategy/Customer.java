package strategy;

public class Customer {
    
    private String name;

    public Customer(String name) {	
	this.name = name;
    }
    
    public void goToPay(Strategy strategy, int dollars) {
	
	System.out.println(name + " " + strategy.pay(dollars));
	
    }    
    

}
