package observer;

public class Main {

    public static void main(String[] args) {
	
	WeatherStation kvilda = new WeatherStation(4);
	
	Observer milan = new Human("Milan", kvilda);
	Observer marta = new Human("Marta", kvilda);
	
	kvilda.setTemperature(12);	
	
	kvilda.removeObserver(milan);
	
	kvilda.setTemperature(-26);
	
	kvilda.removeObserver(marta);
    }

}
