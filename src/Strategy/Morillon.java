package Strategy;

/**
 * Created by baptiste on 01/06/17.
 */
public class Morillon extends Canard{

    public Morillon(){
        setMaFaconDeVoler(new VolAvecLesAiles());
    }

    @Override
    public void afficheToi(){
        System.out.println("Je suis un Morillon!");
    }

}
