package bridge;

public class sportCar extends Vehicle {
    
    private String name;

    public sportCar(String name, Engine engine) {
	super(engine);
	this.name = name;
    }

    @Override
    public void drive() {
	
	System.out.println("I am " + name);
	
	int enginePower = this.getEngine().go();
	
	showSpeed(enginePower);
	
    }    
    

}
