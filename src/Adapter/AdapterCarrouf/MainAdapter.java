package Adapter.AdapterCarrouf;

/**
 * Created by baptiste on 15/06/17.
 */
public class MainAdapter {
    public static void main(String[] args) {
        Chargeur chargeur = new Chargeur();

        PortableSonneEricSonne portableSonne = new PortableSonneEricSonne();
        AdapterSonneEricSonne adapterSonne = new AdapterSonneEricSonne(portableSonne);

        chargeur.brancherPortable(adapterSonne);

        System.out.println("");
        System.out.println("");

        PortableSamSaoule portableSamSaoule= new PortableSamSaoule();
        AdapterSamSaoule adapterSamSaoule = new AdapterSamSaoule(portableSamSaoule);

        chargeur.brancherPortable(adapterSamSaoule);

        System.out.println("");

    }
}
