package decorator;

/**
 * 
 * This pattern creates a decorator class which wraps the original class and 
 * provides additional functionality keeping class methods signature intact.
 *
 */
public abstract class ShapeDecorator implements Shape {
    
    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {	
	this.decoratedShape = decoratedShape;
    }

    @Override
    public String draw() {
	
	return decoratedShape.draw();
	
    }  
    
    

}
