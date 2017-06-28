package Controle.DecorateurDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class Chantilly extends DecoDessert {
    private double prixChantilly;

    Chantilly(Dessert p_dessert) {
        super(p_dessert);
        super.ajoutSupplement(p_dessert.getPrix() + 0.5);
    }

}
