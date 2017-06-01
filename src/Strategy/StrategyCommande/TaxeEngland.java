package Strategy.StrategyCommande;

/**
 * Created by baptiste on 01/06/17.
 */
public class TaxeEngland implements ITaxe {

    public static final double taxeEngland = 1.87;

    public double returnMontantTaxePays(Double montant){
        return (taxeEngland * montant)/100;
    }

}
