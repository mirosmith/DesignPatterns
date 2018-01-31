package factory;

public class Jeans extends Clothes {

    public Jeans(String brand, String color) {
	super(brand, color);	
    }

    @Override
    public String toString() {
	return "Jeans " + getBrand() + " in " + getColor() + " color.";
    }  
    

}
