package command;

// class that invokes specific order
public class MenuOptions {
    
    private Order myOrder;

    public MenuOptions(Order myOrder) {	
	this.myOrder = myOrder;
    }
    
    public void action() {
	
	myOrder.execute();
	
    }    
    

}
