package Controle.DecorateurDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public abstract class Dessert {
    private double prix;

    Dessert(){}

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        System.out.println("dessert : " + prix);
        this.prix = prix;
    }

}
