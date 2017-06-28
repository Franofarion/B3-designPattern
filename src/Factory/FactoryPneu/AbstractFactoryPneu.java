package Factory.FactoryPneu;

/**
 * Created by baptiste on 28/06/17.
 */
public interface AbstractFactoryPneu {

    IPneuNeige createPneuNeigeBase();
    IPneuNeige createPneuNeigeGlace();

    IPneuPluie createPneuPluieSport();
    IPneuPluie createPneuPluieVille();

}
