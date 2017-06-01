package Strategy.StrategyChevalier;

/**
 * Created by baptiste on 01/06/17.
 */
public abstract class Personnage {

    private ICombat monStyleDeCombat;

    public abstract void presenteToi();

    public void batsToi(){
        this.monStyleDeCombat.executeToi();
    }

    public ICombat getMonStyleDeCombat() {
        return monStyleDeCombat;
    }

    public void setMonStyleDeCombat(ICombat monStyleDeCombat) {
        this.monStyleDeCombat = monStyleDeCombat;
    }
}
