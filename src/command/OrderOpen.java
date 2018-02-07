package command;

// concrete order for our Document class
public class OrderOpen implements Order {
    
    private Document myDocument;

    public OrderOpen(Document myDocument) {	
	this.myDocument = myDocument;
    }

    @Override
    public void execute() {
	
	myDocument.open();
	
    }   
    

}
