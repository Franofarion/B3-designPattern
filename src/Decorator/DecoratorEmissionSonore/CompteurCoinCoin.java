package Decorator.DecoratorEmissionSonore;

/**
 * Created by baptiste on 28/06/17.
 */
public class CompteurCoinCoin implements EmissionSonore{

    static Integer compteur = 0;
    EmissionSonore monDecore;

    CompteurCoinCoin(EmissionSonore es){
        monDecore = es;
    }

    public void emetUnSon(){
        monDecore.emetUnSon();
        compteur++;
    }

    public Integer getCompteur(){
        return compteur;
    }

}
