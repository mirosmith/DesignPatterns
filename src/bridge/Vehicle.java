package bridge;

public abstract class Vehicle {
    
    private Engine engine;

    public Vehicle(Engine engine) {	
	this.engine = engine;
    }  
    
    public Engine getEngine() {
        return engine;
    }
    
    public abstract void drive();  
    
    public void showSpeed(int horsePower) {
	
	if (horsePower > 100) {	    
	    System.out.println("Powerfull engine. It can go realy fast");
	}
	else {
	    System.out.println("Weak engine. It goes slowly.");
	}
	
    }
    

}
