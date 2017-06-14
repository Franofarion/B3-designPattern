package Decorator.Decorator.Facture;

import java.util.Date;

/**
 * Created by baptiste on 14/06/17.
 */
public class DecoratorFacture extends Facture {
    private Facture decore;

    public DecoratorFacture(Facture p_deco) {
        super();
        decore = p_deco;
    }

    public void imprimeToi(){
        decore.imprimeToi();
    }

}
