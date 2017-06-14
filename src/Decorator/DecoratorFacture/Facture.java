package Decorator.DecoratorFacture;

import java.util.Date;

/**
 * Created by baptiste on 14/06/17.
 */
public abstract class Facture {

    private String nom;
    private Date date;

    public Facture(){}

    public Facture(String n, Date d){
        setNom(n);
        setDate(d);
    }

    public abstract void imprimeToi();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

