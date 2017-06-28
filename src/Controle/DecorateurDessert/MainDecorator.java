package Controle.DecorateurDessert;

/**
 * Created by baptiste on 15/06/17.
 */
public class MainDecorator {
    public static void main(String[] args) {

        Dessert d = new Crepe();
        System.out.println("Prix crepe : "+d.getPrix());
        d = new Chantilly(d);
        System.out.println("Prix crepe : "+d.getPrix());

    }

}
