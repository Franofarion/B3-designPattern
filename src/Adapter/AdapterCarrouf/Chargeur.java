package Adapter.AdapterCarrouf;

/**
 * Created by baptiste on 15/06/17.
 */
public class Chargeur{
    // le portable branché sur le chargeur
    private IChargeable telephone;
    // le voltage en sortie du chargeur
    private final int voltage = 10;
    // branchement d'un portable pour le charger
    public void brancherPortable(IChargeable portable)
    {
        System.out.println("branchement d'un portable");
        this.telephone = portable;
        this.telephone.Recharger(voltage);
    }
}
