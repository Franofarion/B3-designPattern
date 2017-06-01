package Strategy.StrategyCommande;

/**
 * Created by baptiste on 01/06/17.
 */
public class Commande {

    private ITaxe taxe;
    private Double montantHT;

    public Commande(ITaxe taxe){
       this.setTaxe(taxe);
    }

    public Commande(){
    }

    public void setTaxe(ITaxe taxe) {
        this.taxe = taxe;
    }

    public void setMontantHT(Double montant){
        this.montantHT  = montant;
    }

    public Double getMontantHT() {
        return montantHT;
    }

    public void calculerMontantTTC(){
        Double montantTTC = this.getMontantHT() + this.taxe.returnMontantTaxePays(this.getMontantHT());
        System.out.println("Montant de la commande TTC : "+ montantTTC);
        System.out.println("Montant de la commande HT : "+ montantHT);
        System.out.println("Montant de la taxe : "+ this.taxe.returnMontantTaxePays(this.getMontantHT()));
    }
}
