package builder;

import java.util.LinkedList;
import java.util.List;

public class Meal {

    private List<Item> items = new LinkedList<>();
    
    public void addItem(Item item) {
	
	items.add(item);
	
    }
    
    public int priceOfMeal() {
	
	int sum = 0;
	
	for (Item element : items) {
	    
	    sum += element.getPrice();
	    
	}
	
	return sum;
	
    }
    
    public void showItems() {
	
	for (Item element : items) {
	    
	    System.out.println(element.getName() + " " + 
		    	       element.getPrice() + "Kc " + 
		    	       element.getPacking().getPack());
	    
	}
	
    }
    
}
