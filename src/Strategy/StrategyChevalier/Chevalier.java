package Strategy.StrategyChevalier;

/**
 * Created by baptiste on 01/06/17.
 */
public class Chevalier extends Personnage {

    public Chevalier(){
        setMonStyleDeCombat(new CombatAuSabre());
    }

    public void presenteToi(){
        System.out.println("Je suis un Chevalier!");
    }


}
