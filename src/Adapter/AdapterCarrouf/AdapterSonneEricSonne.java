package Adapter.AdapterCarrouf;

/**
 * Created by baptiste on 15/06/17.
 */
public class AdapterSonneEricSonne implements IChargeable {
    private PortableSonneEricSonne telephone;

    public AdapterSonneEricSonne(PortableSonneEricSonne p_telephone){
        telephone = p_telephone;
    }


    @Override
    public void Recharger(int volt){
        int nouveauVoltage = volt > 5 ? 5 : volt;
        this.telephone.ChargerBatteries(nouveauVoltage);
    }

}
