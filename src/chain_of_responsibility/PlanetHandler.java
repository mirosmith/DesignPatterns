package chain_of_responsibility;

/**
 * 
 * If the first handler can't handle the request, the request is forwarded to the next handler, 
 * and it is passed down the chain until the request reaches a handler that can handle the request or the chain ends.
 * 
 * + It reduces the coupling.
 * + It adds flexibility while assigning the responsibilities to objects.
 * + It allows a set of classes to act as one; events produced in one class can be sent to other handler classes with the help of composition.
 *
 */

public abstract class PlanetHandler {
    
    private PlanetHandler successor;
    
    public PlanetHandler getSuccessor() {
        return successor;
    }

    public void setPlanetHandler(PlanetHandler handler) {
	this.successor = handler;
    }

    public abstract void hadleRequest(PlanetEnum planet);
}
