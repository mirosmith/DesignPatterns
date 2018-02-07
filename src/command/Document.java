package command;

public class Document {
    
    private String name;

    public Document(String name) {	
	this.name = name;
    }
    
    public void open() {
	
	System.out.println("Document " + name + " has been opened.");
	
    }
    
    public void save() {
	
	System.out.println("Document " + name + " has been saved.");
	
    }
    
    

}
