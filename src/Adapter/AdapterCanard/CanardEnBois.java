package Adapter.AdapterCanard;

/**
 * Created by baptiste on 01/06/17.
 */
public class CanardEnBois extends Canard {

    public CanardEnBois(){
        setMaFaconDeVoler(new NoVol());
    }

    @Override
    public void afficheToi(){
        System.out.println("Je suis un CanardEnBois!");
    }

}
