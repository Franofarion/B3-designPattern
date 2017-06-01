package Strategy.StrategyCanard;

/**
 * Created by baptiste on 01/06/17.
 */
public abstract class Canard{

    private Vol maFaconDeVoler;

    public abstract void afficheToi();

    public void nage(){
        System.out.println("Je Nage!");
    }

    public void faitCoinCoin(){
        System.out.println("CoinCoin!");
    }


    public Vol getMaFaconDeVoler() {
        return maFaconDeVoler;
    }

    public void setMaFaconDeVoler(Vol maFaconDeVoler) {
        this.maFaconDeVoler = maFaconDeVoler;
    }

    public void envoleToi(){
        this.maFaconDeVoler.vole();
    }
}

