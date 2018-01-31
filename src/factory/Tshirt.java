package factory;

public class Tshirt extends Clothes {

    public Tshirt(String brand, String color) {
	super(brand, color);	
    }

    @Override
    public String toString() {
	return "T-shirt " + getBrand() + " in " + getColor() + " color.";
    }  
    
}
