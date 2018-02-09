package flyweight;

public class Main {

    public static void main(String[] args) {
	
	String[] parts = {"Leg", "LEG", "HAND", "leg", "Hand"};
	
	for (String s : parts) {
	    Part p = BodyPartsFactory.getPart(s);
	    p.usage();
	}	
	
    }

}
