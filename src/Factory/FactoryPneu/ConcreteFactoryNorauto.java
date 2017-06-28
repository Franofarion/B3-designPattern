package Factory.FactoryPneu;

/**
 * Created by baptiste on 28/06/17.
 */
public class ConcreteFactoryNorauto implements AbstractFactoryPneu {

    @Override
    public IPneuNeige createPneuNeigeBase(){
        return new PneuNeigeBase();
    }

    @Override
    public IPneuNeige createPneuNeigeGlace(){
        return new PneuNeigeGlace();
    }

    @Override
    public IPneuPluie createPneuPluieSport(){
        return new PneuPluieSport();
    }

    @Override
    public IPneuPluie createPneuPluieVille(){
        return new PneuPluieVille();
    }

}
