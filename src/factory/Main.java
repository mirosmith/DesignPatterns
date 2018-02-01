package factory;

public class Main {

    public static void main(String[] args) {	
	
	Clothes triko = Factory.getClothes("tshirt", "Addidas", "blue");
	Clothes jeans = Factory.getClothes("JEANS", "Peace", "black");
	
	if (triko != null) {
	    System.out.println(triko);
	}
	if (jeans != null) {
	    System.out.println(jeans);
	}
	

    }

}
