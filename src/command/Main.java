package command;

public class Main {

    public static void main(String[] args) {
	
	Document docOne = new Document("Document222");
	
	Order orderOpen = new OrderOpen(docOne);	
	
	MenuOptions menu = new MenuOptions(orderOpen);
	
	menu.action();
	
	
	
	Order orderSave = new OrderSave(docOne);
	
	menu = new MenuOptions(orderSave);
	
	menu.action();

    }

}
