package decorator;

public class Main {

    public static void main(String[] args) {
	
	Shape normalCircle = new Circle();
	System.out.println(normalCircle.draw());
	
	Shape blueCircle = new BlueShapeDecorator(normalCircle);
	System.out.println(blueCircle.draw());
	
	Shape blueSquare = new BlueShapeDecorator(new Square());
	System.out.println(blueSquare.draw());
    }

}
