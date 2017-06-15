package Controle.StrategyDessert;

/**
 * Created by baptiste on 15/06/17.
 */

public abstract class Dessert{
    private Ingredient ingr;
    private double prix;

    public Dessert(){}

    public Dessert(Ingredient p_ingr){
        ingr = p_ingr;
    }

    public void addIngredient(Ingredient new_ingr){
        setIngr(new_ingr);
        prix = ingr.coutIngredient(prix);
    }

    public Ingredient getIngr() {
        return ingr;
    }

    public void setIngr(Ingredient ingr) {
        this.ingr = ingr;
    }


    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
