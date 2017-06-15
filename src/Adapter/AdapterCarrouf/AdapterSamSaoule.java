package Adapter.AdapterCarrouf;

/**
 * Created by baptiste on 15/06/17.
 */
public class AdapterSamSaoule implements IChargeable {
    private PortableSamSaoule telephone;

    public AdapterSamSaoule(PortableSamSaoule p_telephone){
        telephone = p_telephone;
    }


    @Override
    public void Recharger(int volt){
        int nouveauVoltage = volt > 10 ? 10 : volt;
        this.telephone.ChargerPortable(nouveauVoltage);
    }

}

