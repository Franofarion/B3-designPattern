package Decorator.DecoratorFacture;

import java.util.Date;

/**
 * Created by baptiste on 14/06/17.
 */
public class MainDecorator {

    public static void main(String[] args){
        Facture f = new FactureSimple("Etudiant", new Date());
        f = new EnTete(f,"Epsi bla bla");
        f = new Pub(f, "Chez casto");
        f = new Pub(f, "Dell y a ka");
        f.imprimeToi();
    }

}
