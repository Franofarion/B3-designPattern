package Strategy.StrategyChevalier;

/**
 * Created by baptiste on 01/06/17.
 */
public class Troll extends Personnage {

    public Troll(){
        setMonStyleDeCombat(new CombatALaHache());
    }

    public void presenteToi(){
        System.out.println("Je suis un Troll!");
    }

}
