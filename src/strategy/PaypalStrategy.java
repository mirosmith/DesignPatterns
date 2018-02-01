package strategy;

public class PaypalStrategy implements Strategy {
    
    private String username;
    private String password;     

    public PaypalStrategy(String username, String password) {	
	this.setUsername(username);
	this.setPassword(password);
    }

    @Override
    public String pay(int howMuch) {
	
	return "paid using PayPal " + howMuch + " $.";
	
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

}
