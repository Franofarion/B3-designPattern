package Controle.StrategyDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class MainDessert {
    public static void main(String[] args) {

        Dessert dessert = new Crepe();
        System.out.println("Crepe prix : " + dessert.getPrix());
        dessert.addIngredient(new IChantilly());
        System.out.println("Crepe prix : " + dessert.getPrix());
        dessert.addIngredient(new IChocolat());
        System.out.println("Crepe prix : " + dessert.getPrix());

        System.out.println("");

        Dessert dessert1 = new Gauffre();
        System.out.println("Gauffre prix : " + dessert1.getPrix());
        dessert1.addIngredient(new IChantilly());
        System.out.println("Gauffre prix : " + dessert1.getPrix());
        dessert1.addIngredient(new IChocolat());
        System.out.println("Gauffre prix : " + dessert1.getPrix());

    }
}
