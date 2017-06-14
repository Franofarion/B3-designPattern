package Decorator.DecoratorFacture;

/**
 * Created by baptiste on 14/06/17.
 */
public class Pub extends DecoratorFacture{

    private String pub;

    public Pub(Facture p_deco, String p_pub) {
        super(p_deco);
        pub = p_pub;
    }

    @Override
    public void imprimeToi(){
        super.imprimeToi();
        imprimePub();
    }

    public void imprimePub(){
        System.out.println("Pub : "+pub);
    }
}

