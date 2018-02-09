package flyweight;

public class Leg implements Part {   

    public Leg() {
	System.out.println("creating leg..");
    }
    
    @Override
    public void usage() {
	
	System.out.println("leg can kick someone");
	
    }

}
