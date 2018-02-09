package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Observer pattern is used when there is one-to-many relationship between objects such as 
 * if one object is modified, its dependent objects are notified automatically.
 *
 */
public class WeatherStation implements Subject {
    
    private int temperature;
    
    private List<Observer> observers;

    public WeatherStation(int temperature) {	
	this.temperature = temperature;
	this.observers = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
	
	System.out.println("Temperature has changed to " + temperature);
        this.temperature = temperature;
        doNotify();
        
    }  

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer o) {
	
	this.observers.add(o);	
    }

    @Override
    public void removeObserver(Observer o) {
	
	this.observers.remove(o);
    }

    @Override
    public void doNotify() {
	
	for (Observer ob : observers) {
	    ob.doUpdate(temperature);
	}
	
    }

}
