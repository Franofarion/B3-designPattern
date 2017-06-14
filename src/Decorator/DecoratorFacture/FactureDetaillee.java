package Decorator.DecoratorFacture;

import java.util.Date;

/**
 * Created by baptiste on 14/06/17.
 */
public class FactureDetaillee extends Facture {

    public FactureDetaillee(String n, Date d) {
        super(n, d);
    }

    @Override
    public void imprimeToi() {
        System.out.println("Facture Détaillé");
    }
}
