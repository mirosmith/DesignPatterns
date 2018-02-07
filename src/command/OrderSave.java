package command;

// concrete order for our Document class
public class OrderSave implements Order {
    
    private Document myDocument;

    public OrderSave(Document myDocument) {	
	this.myDocument = myDocument;
    }

    @Override
    public void execute() {
	
	myDocument.save();
	
    }
    

}
