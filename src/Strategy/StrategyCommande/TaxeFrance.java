package Strategy.StrategyCommande;

/**
 * Created by baptiste on 01/06/17.
 */
public class TaxeFrance implements ITaxe {

    public static final double taxeFrance = 1.24;

    public double returnMontantTaxePays(Double montant){
        return (taxeFrance * montant)/100;
    }

}
