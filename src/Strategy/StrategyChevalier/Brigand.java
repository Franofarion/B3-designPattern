package Strategy.StrategyChevalier;

/**
 * Created by baptiste on 01/06/17.
 */
public class Brigand extends Personnage {

    public Brigand(){
        setMonStyleDeCombat(new CombatAuCouteau());
    }

    public void presenteToi(){
        System.out.println("Je suis un Brigand!");
    }

}
