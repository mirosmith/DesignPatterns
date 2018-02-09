package flyweight;

public class Hand implements Part { 
    
    public Hand() {
	System.out.println("creating hand..");
    }

    @Override
    public void usage() {
	
	System.out.println("hand can punch someone");
	
    }

}
