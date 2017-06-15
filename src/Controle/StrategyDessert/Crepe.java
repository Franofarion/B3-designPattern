package Controle.StrategyDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class Crepe extends Dessert{

    Crepe(){
        super.setPrix(1.5);
    }

    Crepe(Ingredient i){
        super(i);
        super.setPrix(1.5);
    }

}
