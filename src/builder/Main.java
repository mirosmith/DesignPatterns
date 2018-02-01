package builder;

public class Main {

    public static void main(String[] args) {
	
	MealBuilder builder = new MealBuilder();
	
	Meal normal = builder.prepareNormalMeal();
	Meal spicy = builder.prepareSpicyMeal();
	
	normal.showItems();
	System.out.println("Total price: " + normal.priceOfMeal() + " Kc");
	
	System.out.println();
	
	spicy.showItems();
	System.out.println("Total price: " + spicy.priceOfMeal() + " Kc");
    }

}
