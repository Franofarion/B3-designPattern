package Strategy.StrategyChevalier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by baptiste on 01/06/17.
 */
public class StrategyChevalier {

    public static void main(String[] args){
        List<Personnage> combattants = new ArrayList<Personnage>();
        combattants.add(new Chevalier());
        combattants.add(new Troll());

        Personnage brigand = new Brigand();
        combattants.add(brigand);

        for(Personnage c : combattants){
            c.presenteToi();
            c.batsToi();
            System.out.println("---");
        }

        brigand.setMonStyleDeCombat(new CombatALaHache());
        System.out.println("----------------------");

        for(Personnage c : combattants){
            c.presenteToi();
            c.batsToi();
            System.out.println("---");
        }
    }

}
