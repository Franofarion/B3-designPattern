package Decorator.Decorator.Facture;

import java.util.Date;

/**
 * Created by baptiste on 14/06/17.
 */
public class EnTete extends DecoratorFacture{

    private String entete;

    public EnTete(Facture p_deco, String p_entete) {
        super(p_deco);
        entete = p_entete;
    }

    @Override
    public void imprimeToi(){
        imprimeEnTete();
        super.imprimeToi();
    }

    public void imprimeEnTete(){
        System.out.println("Entête : "+entete);
    }
}
