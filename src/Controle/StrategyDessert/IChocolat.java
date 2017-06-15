package Controle.StrategyDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class IChocolat implements Ingredient {


    @Override
    public double coutIngredient(double dessert) {
        return dessert + 0.2;
    }
}
