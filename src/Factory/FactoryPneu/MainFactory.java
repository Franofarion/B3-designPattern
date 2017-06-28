package Factory.FactoryPneu;

/**
 * Created by baptiste on 28/06/17.
 */
public class MainFactory {

    public static void main(String[] args) {

        AbstractFactoryPneu usinePneu = new ConcreteFactoryMichelin();

        IPneuPluie pneuPluieSport = usinePneu.createPneuPluieSport();
        IPneuPluie pneuPluieVille = usinePneu.createPneuPluieVille();

        usinePneu = new ConcreteFactoryNorauto();

        pneuPluieSport = usinePneu.createPneuPluieSport();
        pneuPluieVille = usinePneu.createPneuPluieVille();


    }

}
