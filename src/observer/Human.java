package observer;

public class Human implements Observer {
    
    private String name;
    private WeatherStation station;

    public Human(String name, WeatherStation station) {
	this.name = name;
	this.station = station;
	this.station.addObserver(this);
    }

    @Override
    public void doUpdate(int temperature) {
	
	System.out.println(name + " realized that temperature is " + temperature);
	
    }
    

}
