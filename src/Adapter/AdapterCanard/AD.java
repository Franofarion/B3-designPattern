package Adapter.AdapterCanard;

/**
 * Created by baptiste on 14/06/17.
 */
public class AD extends Canard{

    Dindon d;

    AD(Dindon p_d){
        d = p_d;
    }

    @Override
    public void afficheToi(){
        System.out.println("Je suis un AD");
    }

    @Override
    public void envoleToi(){
        d.deplaceToi();
    }

}
