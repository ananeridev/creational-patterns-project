package anabneri.builder.meal.after.builder;


import anabneri.builder.meal.after.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {
	protected FastFoodMeal meal;
	
	public FastFoodMealBuilder() {
		meal = new FastFoodMeal();
	}
	
	public FastFoodMeal getMeal() {
		return meal;
	}

	// definindo os metodos pra serem asbtratos por padrao
	// isso da a possibilidade de obter apenas o builder necessario
	public void buildDrink() {}
	public void buildMain() {}
	public void buildSide() {}
	public void buildDessert() {}
	public void buildGift() {}
}
