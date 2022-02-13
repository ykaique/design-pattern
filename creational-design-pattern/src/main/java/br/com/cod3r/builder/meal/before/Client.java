package br.com.cod3r.builder.meal.before;

import br.com.cod3r.builder.meal.before.model.FastFoodMeal;

public class Client {

    public static void main(String[] args) {

        FastFoodMeal burgerCombo = new FastFoodMeal("Coke", "CheeseBurger", "Fries");
        System.out.println(burgerCombo);

        FastFoodMeal justFries = new FastFoodMeal(null, null, "Fries");
        System.out.println(justFries);

        FastFoodMeal heartAttackCombo = new FastFoodMeal("Coke 1L", "MegaBurger", "Family Fries", "IceCream", "2kg");
        System.out.println(heartAttackCombo);
    }

}
