package Controle.DecorateurDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class DecoDessert extends Dessert {
    private Dessert dessert;

    DecoDessert(Dessert p_dessert){
        dessert = p_dessert;
    }

    public void ajoutSupplement(double suppl){
        System.out.println("Deco prix :" + suppl);
        dessert.setPrix(suppl);
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public double getPrixDessert(){
        return getPrix();
    }

    public void setPrixDessert(double prixDessert){
        setPrix(prixDessert);
    }


}
