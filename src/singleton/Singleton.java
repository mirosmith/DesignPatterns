package singleton;

public final class Singleton {
    /*
    private static final Singleton singleton = new Singleton();

    private Singleton() {	
	
    }

    public static Singleton getSingleton() {
        return singleton;
    }     
    */
    
    private static Singleton singleton;

    private Singleton() {	
	
    }

    public static Singleton getSingleton() {
	
	if (singleton == null) {
	    singleton = new Singleton();
	}
		
	return singleton;
	
    }  
    

}
