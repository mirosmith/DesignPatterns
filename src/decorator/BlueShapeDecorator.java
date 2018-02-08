package decorator;

public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape decoratedShape) {
	super(decoratedShape);	
    }

    @Override
    public String draw() {	
	
	return super.draw() + " with blue color";
    }
    
    

}
