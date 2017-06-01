package Strategy.StrategyCanard;

/**
 * Created by baptiste on 01/06/17.
 */
public class Colvert extends Canard {

    public Colvert(){
        setMaFaconDeVoler(new VolAvecLesAiles());
    }

    @Override
    public void afficheToi(){
        System.out.println("Je suis un Colvert!");
    }

}
