package bridge;

public class Main {

    public static void main(String[] args) {
	
	Vehicle porsche = new sportCar("Porsche 911 GT3", new BigEngine());
	
	porsche.drive();
	
	Vehicle octavia = new sportCar("Skoda Octavia", new SmallEngine());

	octavia.drive();
    }

}
