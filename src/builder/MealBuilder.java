package builder;

public class MealBuilder {
    
    public Meal prepareSpicyMeal() {
	
	Meal meal = new Meal();	
	
	meal.addItem(new SpicyKebab());
	meal.addItem(new Lemonade());	
	
	return meal;
    }
    
    public Meal prepareNormalMeal() {
	
	Meal meal = new Meal();		
	
	meal.addItem(new NormalKebab());
	meal.addItem(new MineralWater());	
	
	return meal;
    }

}
