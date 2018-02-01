package builder;

abstract class Drink implements Item {    
    
    @Override
    public Packing getPacking() {
	
	return new Bottle();
    }
    
    public abstract String getName();
    public abstract int getPrice();
}
