import Strategy.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baptiste on 01/06/17.
 */
public class DesignPattern {

    public static void main(String[] args){
        List<Canard> canards = new ArrayList<>();
        canards.add(new Colvert());
        canards.add(new Morillon());
        Canard canardEnBois = new CanardEnBois();
        canards.add(canardEnBois); //not a copy, a reference

        for(Canard c : canards){
            c.afficheToi();
            c.envoleToi();
            System.out.println(" -- ");
        }

        canardEnBois.setMaFaconDeVoler(new VolAvecLesAiles());

        for(Canard c : canards){
            c.afficheToi();
            c.envoleToi();
            System.out.println(" -- ");
        }
    }
}
