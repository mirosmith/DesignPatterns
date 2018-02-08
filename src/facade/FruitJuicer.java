package facade;

/**
 * 
 *  The facade simplifies a clients interaction with a complex system by 
 *  localizing the interactions into a single interface.
 *
 */
public class FruitJuicer {
    
    private Fruit melon;
    private Fruit lemon;
    
    public FruitJuicer() {	
	this.melon = new Melon();
	this.lemon = new Lemon();
    }
    
    public void makeMelonJuice() {
	melon.squeeze();
    }
    
    public void makeLemonJuice() {
	lemon.squeeze();
    }
    

}
