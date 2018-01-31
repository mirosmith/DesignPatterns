package factory;

public class Main {

    public static void main(String[] args) {
	
	Clothes triko = Factory.getClothes("tshirt", "Addidas", "blue");
	Clothes jeans = Factory.getClothes("jeans", "Peace", "black");
	
	System.out.println(triko);
	System.out.println(jeans);

    }

}
