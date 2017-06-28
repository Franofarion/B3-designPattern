package Decorator.DecoratorEmissionSonore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baptiste on 28/06/17.
 */
public class UnknownMain {

    public static void main(String[] args) {

        List<EmissionSonore> listES = new ArrayList<EmissionSonore>();
        EmissionSonore e = new CompteurCoinCoin(new Colvert());
        listES.add(e);

        listES.add(new CompteurCoinCoin(new Morillon()));

        for(EmissionSonore es: listES){
            es.emetUnSon();
        }

        System.out.println("Compteur : "+ ((CompteurCoinCoin) e).getCompteur());
    }

}
