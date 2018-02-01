package builder;

abstract class Kebab implements Item {

    @Override
    public Packing getPacking() {
	
	return new Paper();
    }
    
    public abstract String getName();
    public abstract int getPrice();

}
