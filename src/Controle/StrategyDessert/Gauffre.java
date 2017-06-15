package Controle.StrategyDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class Gauffre extends Dessert{

    Gauffre(){
        super.setPrix(1.8);
    }

    Gauffre(Ingredient i){
        super(i);
        super.setPrix(1.8);
    }

}
