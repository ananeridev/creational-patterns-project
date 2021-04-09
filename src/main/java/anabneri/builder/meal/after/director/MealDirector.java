package anabneri.builder.meal.after.director;


import anabneri.builder.meal.after.builder.FastFoodMealBuilder;
import anabneri.builder.meal.after.model.FastFoodMeal;

// this nethod have the complexity cyclomatic 3
public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
