package Strategy.StrategyCommande;

/**
 * Created by baptiste on 01/06/17.
 */
public class StrategyCommande {

    public static void main(String[] args) {
        Commande commande = new Commande(new TaxeEngland());

        Double montant = 15.02;
        commande.setMontantHT(montant);

        commande.calculerMontantTTC();
    }


}
